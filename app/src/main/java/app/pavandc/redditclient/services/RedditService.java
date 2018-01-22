package app.pavandc.redditclient.services;

import app.pavandc.redditclient.model.RedditObject;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by pavandc on 2018-01-21.
 */

public interface RedditService {

    @GET("/.json")
    Call<RedditObject> fetchPosts(@Query("after") String after,
                                  @Query("limit") String limit);

}
