package app.pavandc.redditclient.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pavandc on 2018-01-21.
 */

public class Oembed {

    @SerializedName("author_name")
    private String mAuthorName;
    @SerializedName("author_url")
    private String mAuthorUrl;
    @SerializedName("height")
    private Long mHeight;
    @SerializedName("html")
    private String mHtml;
    @SerializedName("provider_name")
    private String mProviderName;
    @SerializedName("provider_url")
    private String mProviderUrl;
    @SerializedName("thumbnail_height")
    private Long mThumbnailHeight;
    @SerializedName("thumbnail_url")
    private String mThumbnailUrl;
    @SerializedName("thumbnail_width")
    private Long mThumbnailWidth;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("type")
    private String mType;
    @SerializedName("version")
    private String mVersion;
    @SerializedName("width")
    private Long mWidth;

    public void setmAuthorName(String mAuthorName) {
        this.mAuthorName = mAuthorName;
    }

    public void setmAuthorUrl(String mAuthorUrl) {
        this.mAuthorUrl = mAuthorUrl;
    }

    public void setmHeight(Long mHeight) {
        this.mHeight = mHeight;
    }

    public void setmHtml(String mHtml) {
        this.mHtml = mHtml;
    }

    public void setmProviderName(String mProviderName) {
        this.mProviderName = mProviderName;
    }

    public void setmProviderUrl(String mProviderUrl) {
        this.mProviderUrl = mProviderUrl;
    }

    public void setmThumbnailHeight(Long mThumbnailHeight) {
        this.mThumbnailHeight = mThumbnailHeight;
    }

    public void setmThumbnailUrl(String mThumbnailUrl) {
        this.mThumbnailUrl = mThumbnailUrl;
    }

    public void setmThumbnailWidth(Long mThumbnailWidth) {
        this.mThumbnailWidth = mThumbnailWidth;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public void setmVersion(String mVersion) {
        this.mVersion = mVersion;
    }

    public void setmWidth(Long mWidth) {
        this.mWidth = mWidth;
    }


    public String getmAuthorName() {
        return mAuthorName;
    }

    public String getmAuthorUrl() {
        return mAuthorUrl;
    }

    public Long getmHeight() {
        return mHeight;
    }

    public String getmHtml() {
        return mHtml;
    }

    public String getmProviderName() {
        return mProviderName;
    }

    public String getmProviderUrl() {
        return mProviderUrl;
    }

    public Long getmThumbnailHeight() {
        return mThumbnailHeight;
    }

    public String getmThumbnailUrl() {
        return mThumbnailUrl;
    }

    public Long getmThumbnailWidth() {
        return mThumbnailWidth;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmType() {
        return mType;
    }

    public String getmVersion() {
        return mVersion;
    }

    public Long getmWidth() {
        return mWidth;
    }

}
