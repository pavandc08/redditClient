package app.pavandc.redditclient.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pavandc on 2018-01-21.
 */

public class RedditObject {

    @SerializedName("data")
    private Data mData;
    @SerializedName("kind")
    private String mKind;

    public Data getData() {
        return mData;
    }

    public void setData(Data mData) {
        this.mData = mData;
    }

    public String getKind() {
        return mKind;
    }

    public void setKind(String mKind) {
        this.mKind = mKind;
    }
}
