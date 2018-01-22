package app.pavandc.redditclient.repository;

import app.pavandc.redditclient.model.RedditObject;

/**
 * Created by pavandc on 2018-01-21.
 */

public abstract class FetchPostRepository {

    public interface OnFinishedListener {
        void onFinished(RedditObject items);
        void onDefaultError();
    }

    public abstract void getPosts(String after, String limit, OnFinishedListener listener);
}
