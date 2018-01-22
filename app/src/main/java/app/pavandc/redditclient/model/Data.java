package app.pavandc.redditclient.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pavandc on 2018-01-21.
 */

public class Data {

    @SerializedName("after")
    private String mAfter;
    @SerializedName("approved_by")
    private Object mApprovedBy;
    @SerializedName("archived")
    private Boolean mArchived;
    @SerializedName("author")
    private String mAuthor;
    @SerializedName("author_flair_css_class")
    private String mAuthorFlairCssClass;
    @SerializedName("author_flair_text")
    private String mAuthorFlairText;
    @SerializedName("banned_by")
    private Object mBannedBy;
    @SerializedName("before")
    private Object mBefore;
    @SerializedName("brand_safe")
    private Boolean mBrandSafe;
    @SerializedName("body")
    private String mBody;
    @SerializedName("children")
    private List<RedditObject> mChildren;
    @SerializedName("clicked")
    private Boolean mClicked;
    @SerializedName("contest_mode")
    private Boolean mContestMode;
    @SerializedName("created")
    private Long mCreated;
    @SerializedName("created_utc")
    private Long mCreatedUtc;
    @SerializedName("distinguished")
    private Object mDistinguished;
    @SerializedName("domain")
    private String mDomain;
    @SerializedName("downs")
    private Long mDowns;
    @SerializedName("gilded")
    private Long mGilded;
    @SerializedName("hidden")
    private Boolean mHidden;
    @SerializedName("hide_score")
    private Boolean mHideScore;
    @SerializedName("id")
    private String mId;
    @SerializedName("is_self")
    private Boolean mIsSelf;
    @SerializedName("likes")
    private Object mLikes;
    @SerializedName("link_flair_css_class")
    private Object mLinkFlairCssClass;
    @SerializedName("link_flair_text")
    private Object mLinkFlairText;
    @SerializedName("locked")
    private Boolean mLocked;
    @SerializedName("media")
    private Media mMedia;
    @SerializedName("media_embed")
    private MediaEmbed mMediaEmbed;
    @SerializedName("mod_reports")
    private List<Object> mModReports;
    @SerializedName("modhash")
    private String mModhash;
    @SerializedName("name")
    private String mName;
    @SerializedName("num_comments")
    private Long mNumComments;
    @SerializedName("num_reports")
    private Object mNumReports;
    @SerializedName("over_18")
    private Boolean mOver18;
    @SerializedName("permalink")
    private String mPermalink;
    @SerializedName("post_hint")
    private String mPostHint;
    @SerializedName("preview")
    private Preview mPreview;
    @SerializedName("quarantine")
    private Boolean mQuarantine;
    @SerializedName("removal_reason")
    private Object mRemovalReason;
    @SerializedName("report_reasons")
    private Object mReportReasons;
    @SerializedName("saved")
    private Boolean mSaved;
    @SerializedName("score")
    private Long mScore;
    @SerializedName("secure_media")
    private Media mSecureMedia;
    @SerializedName("secure_media_embed")
    private SecureMediaEmbed mSecureMediaEmbed;
    @SerializedName("selftext")
    private String mSelftext;
    @SerializedName("selftext_html")
    private String mSelftextHtml;
    @SerializedName("spoiler")
    private Boolean mSpoiler;
    @SerializedName("stickied")
    private Boolean mStickied;
    @SerializedName("subreddit")
    private String mSubreddit;
    @SerializedName("subreddit_id")
    private String mSubredditId;
    @SerializedName("subreddit_name_prefixed")
    private String mSubredditNamePrefixed;
    @SerializedName("subreddit_type")
    private String mSubredditType;
    @SerializedName("suggested_sort")
    private Object mSuggestedSort;
    @SerializedName("thumbnail")
    private String mThumbnail;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("ups")
    private Long mUps;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("user_reports")
    private List<Object> mUserReports;
    @SerializedName("visited")
    private Boolean mVisited;

    public String getmAfter() {
        return mAfter;
    }

    public void setmAfter(String mAfter) {
        this.mAfter = mAfter;
    }

    public Object getmApprovedBy() {
        return mApprovedBy;
    }

    public void setmApprovedBy(Object mApprovedBy) {
        this.mApprovedBy = mApprovedBy;
    }

    public Boolean getmArchived() {
        return mArchived;
    }

    public void setmArchived(Boolean mArchived) {
        this.mArchived = mArchived;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public void setmAuthor(String mAuthor) {
        this.mAuthor = mAuthor;
    }

    public String getmAuthorFlairCssClass() {
        return mAuthorFlairCssClass;
    }

    public void setmAuthorFlairCssClass(String mAuthorFlairCssClass) {
        this.mAuthorFlairCssClass = mAuthorFlairCssClass;
    }

    public String getmAuthorFlairText() {
        return mAuthorFlairText;
    }

    public void setmAuthorFlairText(String mAuthorFlairText) {
        this.mAuthorFlairText = mAuthorFlairText;
    }

    public Object getmBannedBy() {
        return mBannedBy;
    }

    public void setmBannedBy(Object mBannedBy) {
        this.mBannedBy = mBannedBy;
    }

    public Object getmBefore() {
        return mBefore;
    }

    public void setmBefore(Object mBefore) {
        this.mBefore = mBefore;
    }

    public Boolean getmBrandSafe() {
        return mBrandSafe;
    }

    public void setmBrandSafe(Boolean mBrandSafe) {
        this.mBrandSafe = mBrandSafe;
    }

    public String getmBody() {
        return mBody;
    }

    public void setmBody(String mBody) {
        this.mBody = mBody;
    }

    public List<RedditObject> getChildren() {
        return mChildren;
    }

    public void setChildren(List<RedditObject> mChildren) {
        this.mChildren = mChildren;
    }

    public Boolean getmClicked() {
        return mClicked;
    }

    public void setmClicked(Boolean mClicked) {
        this.mClicked = mClicked;
    }

    public Boolean getmContestMode() {
        return mContestMode;
    }

    public void setmContestMode(Boolean mContestMode) {
        this.mContestMode = mContestMode;
    }

    public Long getmCreated() {
        return mCreated;
    }

    public void setmCreated(Long mCreated) {
        this.mCreated = mCreated;
    }

    public Long getmCreatedUtc() {
        return mCreatedUtc;
    }

    public void setmCreatedUtc(Long mCreatedUtc) {
        this.mCreatedUtc = mCreatedUtc;
    }

    public Object getmDistinguished() {
        return mDistinguished;
    }

    public void setmDistinguished(Object mDistinguished) {
        this.mDistinguished = mDistinguished;
    }

    public String getmDomain() {
        return mDomain;
    }

    public void setmDomain(String mDomain) {
        this.mDomain = mDomain;
    }

    public Long getmDowns() {
        return mDowns;
    }

    public void setmDowns(Long mDowns) {
        this.mDowns = mDowns;
    }

    public Long getmGilded() {
        return mGilded;
    }

    public void setmGilded(Long mGilded) {
        this.mGilded = mGilded;
    }

    public Boolean getmHidden() {
        return mHidden;
    }

    public void setmHidden(Boolean mHidden) {
        this.mHidden = mHidden;
    }

    public Boolean getmHideScore() {
        return mHideScore;
    }

    public void setmHideScore(Boolean mHideScore) {
        this.mHideScore = mHideScore;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public Boolean getmIsSelf() {
        return mIsSelf;
    }

    public void setmIsSelf(Boolean mIsSelf) {
        this.mIsSelf = mIsSelf;
    }

    public Object getmLikes() {
        return mLikes;
    }

    public void setmLikes(Object mLikes) {
        this.mLikes = mLikes;
    }

    public Object getmLinkFlairCssClass() {
        return mLinkFlairCssClass;
    }

    public void setmLinkFlairCssClass(Object mLinkFlairCssClass) {
        this.mLinkFlairCssClass = mLinkFlairCssClass;
    }

    public Object getmLinkFlairText() {
        return mLinkFlairText;
    }

    public void setmLinkFlairText(Object mLinkFlairText) {
        this.mLinkFlairText = mLinkFlairText;
    }

    public Boolean getmLocked() {
        return mLocked;
    }

    public void setmLocked(Boolean mLocked) {
        this.mLocked = mLocked;
    }

    public Media getmMedia() {
        return mMedia;
    }

    public void setmMedia(Media mMedia) {
        this.mMedia = mMedia;
    }

    public MediaEmbed getmMediaEmbed() {
        return mMediaEmbed;
    }

    public void setmMediaEmbed(MediaEmbed mMediaEmbed) {
        this.mMediaEmbed = mMediaEmbed;
    }

    public List<Object> getmModReports() {
        return mModReports;
    }

    public void setmModReports(List<Object> mModReports) {
        this.mModReports = mModReports;
    }

    public String getmModhash() {
        return mModhash;
    }

    public void setmModhash(String mModhash) {
        this.mModhash = mModhash;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public Long getmNumComments() {
        return mNumComments;
    }

    public void setmNumComments(Long mNumComments) {
        this.mNumComments = mNumComments;
    }

    public Object getmNumReports() {
        return mNumReports;
    }

    public void setmNumReports(Object mNumReports) {
        this.mNumReports = mNumReports;
    }

    public Boolean getmOver18() {
        return mOver18;
    }

    public void setmOver18(Boolean mOver18) {
        this.mOver18 = mOver18;
    }

    public String getmPermalink() {
        return mPermalink;
    }

    public void setmPermalink(String mPermalink) {
        this.mPermalink = mPermalink;
    }

    public String getmPostHint() {
        return mPostHint;
    }

    public void setmPostHint(String mPostHint) {
        this.mPostHint = mPostHint;
    }

    public Preview getmPreview() {
        return mPreview;
    }

    public void setmPreview(Preview mPreview) {
        this.mPreview = mPreview;
    }

    public Boolean getmQuarantine() {
        return mQuarantine;
    }

    public void setmQuarantine(Boolean mQuarantine) {
        this.mQuarantine = mQuarantine;
    }

    public Object getmRemovalReason() {
        return mRemovalReason;
    }

    public void setmRemovalReason(Object mRemovalReason) {
        this.mRemovalReason = mRemovalReason;
    }

    public Object getmReportReasons() {
        return mReportReasons;
    }

    public void setmReportReasons(Object mReportReasons) {
        this.mReportReasons = mReportReasons;
    }

    public Boolean getmSaved() {
        return mSaved;
    }

    public void setmSaved(Boolean mSaved) {
        this.mSaved = mSaved;
    }

    public Long getmScore() {
        return mScore;
    }

    public void setmScore(Long mScore) {
        this.mScore = mScore;
    }

    public Media getmSecureMedia() {
        return mSecureMedia;
    }

    public void setmSecureMedia(Media mSecureMedia) {
        this.mSecureMedia = mSecureMedia;
    }

    public SecureMediaEmbed getmSecureMediaEmbed() {
        return mSecureMediaEmbed;
    }

    public void setmSecureMediaEmbed(SecureMediaEmbed mSecureMediaEmbed) {
        this.mSecureMediaEmbed = mSecureMediaEmbed;
    }

    public String getmSelftext() {
        return mSelftext;
    }

    public void setmSelftext(String mSelftext) {
        this.mSelftext = mSelftext;
    }

    public String getmSelftextHtml() {
        return mSelftextHtml;
    }

    public void setmSelftextHtml(String mSelftextHtml) {
        this.mSelftextHtml = mSelftextHtml;
    }

    public Boolean getmSpoiler() {
        return mSpoiler;
    }

    public void setmSpoiler(Boolean mSpoiler) {
        this.mSpoiler = mSpoiler;
    }

    public Boolean getmStickied() {
        return mStickied;
    }

    public void setmStickied(Boolean mStickied) {
        this.mStickied = mStickied;
    }

    public String getmSubreddit() {
        return mSubreddit;
    }

    public void setmSubreddit(String mSubreddit) {
        this.mSubreddit = mSubreddit;
    }

    public String getmSubredditId() {
        return mSubredditId;
    }

    public void setmSubredditId(String mSubredditId) {
        this.mSubredditId = mSubredditId;
    }

    public String getmSubredditNamePrefixed() {
        return mSubredditNamePrefixed;
    }

    public void setmSubredditNamePrefixed(String mSubredditNamePrefixed) {
        this.mSubredditNamePrefixed = mSubredditNamePrefixed;
    }

    public String getmSubredditType() {
        return mSubredditType;
    }

    public void setmSubredditType(String mSubredditType) {
        this.mSubredditType = mSubredditType;
    }

    public Object getmSuggestedSort() {
        return mSuggestedSort;
    }

    public void setmSuggestedSort(Object mSuggestedSort) {
        this.mSuggestedSort = mSuggestedSort;
    }

    public String getThumbnail() {
        return mThumbnail;
    }

    public void setmThumbnail(String mThumbnail) {
        this.mThumbnail = mThumbnail;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Long getmUps() {
        return mUps;
    }

    public void setmUps(Long mUps) {
        this.mUps = mUps;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public List<Object> getmUserReports() {
        return mUserReports;
    }

    public void setmUserReports(List<Object> mUserReports) {
        this.mUserReports = mUserReports;
    }

    public Boolean getmVisited() {
        return mVisited;
    }

    public void setmVisited(Boolean mVisited) {
        this.mVisited = mVisited;
    }
}
