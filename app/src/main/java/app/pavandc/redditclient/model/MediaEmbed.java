package app.pavandc.redditclient.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pavandc on 2018-01-21.
 */

public class MediaEmbed {

    @SerializedName("content")
    private String mContent;
    @SerializedName("height")
    private Long mHeight;
    @SerializedName("scrolling")
    private Boolean mScrolling;

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

    public Long getmHeight() {
        return mHeight;
    }

    public void setmHeight(Long mHeight) {
        this.mHeight = mHeight;
    }

    public Boolean getmScrolling() {
        return mScrolling;
    }

    public void setmScrolling(Boolean mScrolling) {
        this.mScrolling = mScrolling;
    }


}
