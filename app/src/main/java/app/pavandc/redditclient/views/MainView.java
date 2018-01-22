package app.pavandc.redditclient.views;

import app.pavandc.redditclient.model.RedditObject;

/**
 * Created by pavandc on 2018-01-21.
 */

public interface MainView {

    void showProgress();
    void hideProgress();
    void setItems(RedditObject redditObject);
    void showError(int message);
    boolean isConnected();

}
