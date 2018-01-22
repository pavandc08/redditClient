package app.pavandc.redditclient.presenters;

import app.pavandc.redditclient.R;
import app.pavandc.redditclient.model.RedditObject;
import app.pavandc.redditclient.repository.FetchPostRepository;
import app.pavandc.redditclient.repository.FetchPostRepositoryImpl;
import app.pavandc.redditclient.views.MainView;

/**
 * Created by pavandc on 2018-01-21.
 */

public class MainPresenter implements FetchPostRepository.OnFinishedListener {

    private MainView mainView;
    private FetchPostRepository postRepository = new FetchPostRepositoryImpl();

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    public void onResume() {
        if (mainView != null) {
            mainView.showProgress();
            if (!mainView.isConnected()) {
                handleError(R.string.no_internet_error);
                return;
            }
        }

        postRepository.getPosts("", "10", this);
    }

    public void paginate(String after) {
        postRepository.getPosts(after, "10", this);
    }

    @Override
    public void onFinished(RedditObject items) {
        if (mainView != null) {
            mainView.setItems(items);
            mainView.hideProgress();
        }
    }

    @Override
    public void onDefaultError() {
        handleError(R.string.unexpected_error);
    }

    private void handleError(int id) {
        if (mainView != null) {
            mainView.showError(id);
            mainView.hideProgress();
        }
    }

    public void onDestroy() {
        mainView = null;
    }

    public MainView getMainView() {
        return mainView;
    }
}
