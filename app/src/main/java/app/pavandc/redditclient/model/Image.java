package app.pavandc.redditclient.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pavandc on 2018-01-21.
 */

public class Image {

    @SerializedName("id")
    private String mId;
    @SerializedName("resolutions")
    private List<Resolution> mResolutions;
    @SerializedName("source")
    private Source mSource;


    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public List<Resolution> getmResolutions() {
        return mResolutions;
    }

    public void setmResolutions(List<Resolution> mResolutions) {
        this.mResolutions = mResolutions;
    }

    public Source getmSource() {
        return mSource;
    }

    public void setmSource(Source mSource) {
        this.mSource = mSource;
    }
}
