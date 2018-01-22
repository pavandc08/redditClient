package app.pavandc.redditclient.repository;

import app.pavandc.redditclient.model.RedditObject;
import app.pavandc.redditclient.services.RedditClient;
import app.pavandc.redditclient.services.RedditService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by pavandc on 2018-01-21.
 */

public class FetchPostRepositoryImpl extends FetchPostRepository {

    @Override
    public void getPosts(String after, String limit, final OnFinishedListener listener) {
        RedditService redditService = RedditClient.getRedditService();

       Call<RedditObject> call =  redditService.fetchPosts(after, limit);
       call.enqueue(new Callback<RedditObject>() {
           @Override
           public void onResponse(Call<RedditObject> call, Response<RedditObject> response) {
               listener.onFinished(response.body());
           }

           @Override
           public void onFailure(Call<RedditObject> call, Throwable t) {
               listener.onDefaultError();
           }
       });
    }
}
