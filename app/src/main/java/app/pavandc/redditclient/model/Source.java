package app.pavandc.redditclient.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pavandc on 2018-01-21.
 */

public class Source {

    @SerializedName("height")
    private Long mHeight;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("width")
    private Long mWidth;

    public Long getmHeight() {
        return mHeight;
    }

    public void setmHeight(Long mHeight) {
        this.mHeight = mHeight;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public Long getmWidth() {
        return mWidth;
    }

    public void setmWidth(Long mWidth) {
        this.mWidth = mWidth;
    }
}
