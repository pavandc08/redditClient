package app.pavandc.redditclient.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pavandc on 2018-01-21.
 */

public class Media {

    @SerializedName("oembed")
    private Oembed mOembed;
    @SerializedName("type")
    private String mType;

    public Oembed getOembed() {
        return mOembed;
    }

    public void setOembed(Oembed oembed) {
        mOembed = oembed;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }
}
