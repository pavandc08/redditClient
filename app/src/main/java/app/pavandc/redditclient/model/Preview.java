package app.pavandc.redditclient.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pavandc on 2018-01-21.
 */

public class Preview {

    @SerializedName("enabled")
    private Boolean mEnabled;
    @SerializedName("images")
    private List<Image> mImages;

    public Boolean getmEnabled() {
        return mEnabled;
    }

    public void setmEnabled(Boolean mEnabled) {
        this.mEnabled = mEnabled;
    }

    public List<Image> getmImages() {
        return mImages;
    }

    public void setmImages(List<Image> mImages) {
        this.mImages = mImages;
    }
}
