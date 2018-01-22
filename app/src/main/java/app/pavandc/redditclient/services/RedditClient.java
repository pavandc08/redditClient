package app.pavandc.redditclient.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import app.pavandc.redditclient.model.RedditObject;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by pavandc on 2018-01-21.
 */

public class RedditClient {
    private static final String BASE_URL = "https://www.reddit.com";
    private static Retrofit retrofit = null;
    private static RedditService redditService;

    public static Retrofit getClient() {
        if (retrofit == null) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            httpClient.addInterceptor(logging);

            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                    .create();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(httpClient.build())
                    .build();
        }
        return retrofit;
    }

    public static RedditService getRedditService() {
        if(redditService == null) {
            redditService = getClient().create(RedditService.class);
        }
        return redditService;
    }
}
