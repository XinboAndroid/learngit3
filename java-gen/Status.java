import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Status {

    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @Expose
    private Integer id;
    @Expose
    private String mid;
    @Expose
    private String idstr;
    @Expose
    private String text;
    @Expose
    private Integer textLength;
    @SerializedName("source_allowclick")
    @Expose
    private Integer sourceAllowclick;
    @SerializedName("source_type")
    @Expose
    private Integer sourceType;
    @Expose
    private String source;
    @Expose
    private Boolean favorited;
    @Expose
    private Boolean truncated;
    @SerializedName("in_reply_to_status_id")
    @Expose
    private String inReplyToStatusId;
    @SerializedName("in_reply_to_user_id")
    @Expose
    private String inReplyToUserId;
    @SerializedName("in_reply_to_screen_name")
    @Expose
    private String inReplyToScreenName;
    @SerializedName("pic_urls")
    @Expose
    private List<Object> picUrls = new ArrayList<Object>();
    @Expose
    private Object geo;
    @SerializedName("reposts_count")
    @Expose
    private Integer repostsCount;
    @SerializedName("comments_count")
    @Expose
    private Integer commentsCount;
    @SerializedName("attitudes_count")
    @Expose
    private Integer attitudesCount;
    @Expose
    private Boolean isLongText;
    @Expose
    private Integer mlevel;
    @Expose
    private Visible visible;
    @SerializedName("biz_feature")
    @Expose
    private Integer bizFeature;
    @Expose
    private Integer hasActionTypeCard;
    @SerializedName("darwin_tags")
    @Expose
    private List<Object> darwinTags = new ArrayList<Object>();
    @SerializedName("hot_weibo_tags")
    @Expose
    private List<Object> hotWeiboTags = new ArrayList<Object>();
    @SerializedName("text_tag_tips")
    @Expose
    private List<Object> textTagTips = new ArrayList<Object>();
    @Expose
    private Integer userType;
    @SerializedName("positive_recom_flag")
    @Expose
    private Integer positiveRecomFlag;
    @SerializedName("gif_ids")
    @Expose
    private String gifIds;
    @SerializedName("is_show_bulletin")
    @Expose
    private Integer isShowBulletin;

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The mid
     */
    public String getMid() {
        return mid;
    }

    /**
     * 
     * @param mid
     *     The mid
     */
    public void setMid(String mid) {
        this.mid = mid;
    }

    /**
     * 
     * @return
     *     The idstr
     */
    public String getIdstr() {
        return idstr;
    }

    /**
     * 
     * @param idstr
     *     The idstr
     */
    public void setIdstr(String idstr) {
        this.idstr = idstr;
    }

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The textLength
     */
    public Integer getTextLength() {
        return textLength;
    }

    /**
     * 
     * @param textLength
     *     The textLength
     */
    public void setTextLength(Integer textLength) {
        this.textLength = textLength;
    }

    /**
     * 
     * @return
     *     The sourceAllowclick
     */
    public Integer getSourceAllowclick() {
        return sourceAllowclick;
    }

    /**
     * 
     * @param sourceAllowclick
     *     The source_allowclick
     */
    public void setSourceAllowclick(Integer sourceAllowclick) {
        this.sourceAllowclick = sourceAllowclick;
    }

    /**
     * 
     * @return
     *     The sourceType
     */
    public Integer getSourceType() {
        return sourceType;
    }

    /**
     * 
     * @param sourceType
     *     The source_type
     */
    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * 
     * @return
     *     The source
     */
    public String getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 
     * @return
     *     The favorited
     */
    public Boolean getFavorited() {
        return favorited;
    }

    /**
     * 
     * @param favorited
     *     The favorited
     */
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    /**
     * 
     * @return
     *     The truncated
     */
    public Boolean getTruncated() {
        return truncated;
    }

    /**
     * 
     * @param truncated
     *     The truncated
     */
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * 
     * @return
     *     The inReplyToStatusId
     */
    public String getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    /**
     * 
     * @param inReplyToStatusId
     *     The in_reply_to_status_id
     */
    public void setInReplyToStatusId(String inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    /**
     * 
     * @return
     *     The inReplyToUserId
     */
    public String getInReplyToUserId() {
        return inReplyToUserId;
    }

    /**
     * 
     * @param inReplyToUserId
     *     The in_reply_to_user_id
     */
    public void setInReplyToUserId(String inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    /**
     * 
     * @return
     *     The inReplyToScreenName
     */
    public String getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    /**
     * 
     * @param inReplyToScreenName
     *     The in_reply_to_screen_name
     */
    public void setInReplyToScreenName(String inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    /**
     * 
     * @return
     *     The picUrls
     */
    public List<Object> getPicUrls() {
        return picUrls;
    }

    /**
     * 
     * @param picUrls
     *     The pic_urls
     */
    public void setPicUrls(List<Object> picUrls) {
        this.picUrls = picUrls;
    }

    /**
     * 
     * @return
     *     The geo
     */
    public Object getGeo() {
        return geo;
    }

    /**
     * 
     * @param geo
     *     The geo
     */
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    /**
     * 
     * @return
     *     The repostsCount
     */
    public Integer getRepostsCount() {
        return repostsCount;
    }

    /**
     * 
     * @param repostsCount
     *     The reposts_count
     */
    public void setRepostsCount(Integer repostsCount) {
        this.repostsCount = repostsCount;
    }

    /**
     * 
     * @return
     *     The commentsCount
     */
    public Integer getCommentsCount() {
        return commentsCount;
    }

    /**
     * 
     * @param commentsCount
     *     The comments_count
     */
    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    /**
     * 
     * @return
     *     The attitudesCount
     */
    public Integer getAttitudesCount() {
        return attitudesCount;
    }

    /**
     * 
     * @param attitudesCount
     *     The attitudes_count
     */
    public void setAttitudesCount(Integer attitudesCount) {
        this.attitudesCount = attitudesCount;
    }

    /**
     * 
     * @return
     *     The isLongText
     */
    public Boolean getIsLongText() {
        return isLongText;
    }

    /**
     * 
     * @param isLongText
     *     The isLongText
     */
    public void setIsLongText(Boolean isLongText) {
        this.isLongText = isLongText;
    }

    /**
     * 
     * @return
     *     The mlevel
     */
    public Integer getMlevel() {
        return mlevel;
    }

    /**
     * 
     * @param mlevel
     *     The mlevel
     */
    public void setMlevel(Integer mlevel) {
        this.mlevel = mlevel;
    }

    /**
     * 
     * @return
     *     The visible
     */
    public Visible getVisible() {
        return visible;
    }

    /**
     * 
     * @param visible
     *     The visible
     */
    public void setVisible(Visible visible) {
        this.visible = visible;
    }

    /**
     * 
     * @return
     *     The bizFeature
     */
    public Integer getBizFeature() {
        return bizFeature;
    }

    /**
     * 
     * @param bizFeature
     *     The biz_feature
     */
    public void setBizFeature(Integer bizFeature) {
        this.bizFeature = bizFeature;
    }

    /**
     * 
     * @return
     *     The hasActionTypeCard
     */
    public Integer getHasActionTypeCard() {
        return hasActionTypeCard;
    }

    /**
     * 
     * @param hasActionTypeCard
     *     The hasActionTypeCard
     */
    public void setHasActionTypeCard(Integer hasActionTypeCard) {
        this.hasActionTypeCard = hasActionTypeCard;
    }

    /**
     * 
     * @return
     *     The darwinTags
     */
    public List<Object> getDarwinTags() {
        return darwinTags;
    }

    /**
     * 
     * @param darwinTags
     *     The darwin_tags
     */
    public void setDarwinTags(List<Object> darwinTags) {
        this.darwinTags = darwinTags;
    }

    /**
     * 
     * @return
     *     The hotWeiboTags
     */
    public List<Object> getHotWeiboTags() {
        return hotWeiboTags;
    }

    /**
     * 
     * @param hotWeiboTags
     *     The hot_weibo_tags
     */
    public void setHotWeiboTags(List<Object> hotWeiboTags) {
        this.hotWeiboTags = hotWeiboTags;
    }

    /**
     * 
     * @return
     *     The textTagTips
     */
    public List<Object> getTextTagTips() {
        return textTagTips;
    }

    /**
     * 
     * @param textTagTips
     *     The text_tag_tips
     */
    public void setTextTagTips(List<Object> textTagTips) {
        this.textTagTips = textTagTips;
    }

    /**
     * 
     * @return
     *     The userType
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 
     * @param userType
     *     The userType
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 
     * @return
     *     The positiveRecomFlag
     */
    public Integer getPositiveRecomFlag() {
        return positiveRecomFlag;
    }

    /**
     * 
     * @param positiveRecomFlag
     *     The positive_recom_flag
     */
    public void setPositiveRecomFlag(Integer positiveRecomFlag) {
        this.positiveRecomFlag = positiveRecomFlag;
    }

    /**
     * 
     * @return
     *     The gifIds
     */
    public String getGifIds() {
        return gifIds;
    }

    /**
     * 
     * @param gifIds
     *     The gif_ids
     */
    public void setGifIds(String gifIds) {
        this.gifIds = gifIds;
    }

    /**
     * 
     * @return
     *     The isShowBulletin
     */
    public Integer getIsShowBulletin() {
        return isShowBulletin;
    }

    /**
     * 
     * @param isShowBulletin
     *     The is_show_bulletin
     */
    public void setIsShowBulletin(Integer isShowBulletin) {
        this.isShowBulletin = isShowBulletin;
    }

}
