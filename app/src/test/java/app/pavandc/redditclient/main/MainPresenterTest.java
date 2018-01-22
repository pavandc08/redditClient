package app.pavandc.redditclient.main;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import app.pavandc.redditclient.model.Data;
import app.pavandc.redditclient.model.RedditObject;
import app.pavandc.redditclient.presenters.MainPresenter;
import app.pavandc.redditclient.views.MainView;

import static junit.framework.Assert.assertNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by pavandc on 2018-01-21.
 */
@RunWith(MockitoJUnitRunner.class)

public class MainPresenterTest {

    @Mock
    MainView view;
    private MainPresenter mainPresenter;

    @Before
    public void setup() throws Exception {
      mainPresenter = new MainPresenter(view);
    }

    @Test
    public void checkIfProgressBarIsShown() {
        mainPresenter.onResume();
        verify(view, times(1)).showProgress();
    }

    @Test
    public void checkIfViewReleasedOnDestroy() {
        mainPresenter.onDestroy();
        assertNull(mainPresenter.getMainView());
    }

    @Test
    public void checkIfItemsPassedCorrectly() {
        RedditObject redditObject = new RedditObject();
        Data data = new Data();
        RedditObject child = new RedditObject();
        List<RedditObject> children = new ArrayList<>();
        children.add(child);
        data.setChildren(children);
        redditObject.setData(data);

        mainPresenter.onFinished(redditObject);
        verify(view, times(1)).setItems(redditObject);
        verify(view, times(1)).hideProgress();
    }
}