/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerSession](https://docs.talon.one/integration-api/#operation/updateCustomerSessionV2) endpoint is `https://mycompany.talon.one/v2/customer_sessions/{Id}` 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package one.talon.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import one.talon.model.CodeGeneratorSettings;
import one.talon.model.LimitConfig;
import org.threeten.bp.OffsetDateTime;

/**
 * UpdateCampaign
 */

public class UpdateCampaign {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Object attributes;

  /**
   * A disabled or archived campaign is not evaluated for rules or coupons. 
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ENABLED("enabled"),
    
    DISABLED("disabled"),
    
    ARCHIVED("archived");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state = StateEnum.ENABLED;

  public static final String SERIALIZED_NAME_ACTIVE_RULESET_ID = "activeRulesetId";
  @SerializedName(SERIALIZED_NAME_ACTIVE_RULESET_ID)
  private Integer activeRulesetId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<String>();

  /**
   * Gets or Sets features
   */
  @JsonAdapter(FeaturesEnum.Adapter.class)
  public enum FeaturesEnum {
    COUPONS("coupons"),
    
    REFERRALS("referrals"),
    
    LOYALTY("loyalty"),
    
    GIVEAWAYS("giveaways");

    private String value;

    FeaturesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeaturesEnum fromValue(String value) {
      for (FeaturesEnum b : FeaturesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeaturesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeaturesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeaturesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeaturesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<FeaturesEnum> features = new ArrayList<FeaturesEnum>();

  public static final String SERIALIZED_NAME_COUPON_SETTINGS = "couponSettings";
  @SerializedName(SERIALIZED_NAME_COUPON_SETTINGS)
  private CodeGeneratorSettings couponSettings;

  public static final String SERIALIZED_NAME_REFERRAL_SETTINGS = "referralSettings";
  @SerializedName(SERIALIZED_NAME_REFERRAL_SETTINGS)
  private CodeGeneratorSettings referralSettings;

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private List<LimitConfig> limits = new ArrayList<LimitConfig>();

  public static final String SERIALIZED_NAME_CAMPAIGN_GROUPS = "campaignGroups";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_GROUPS)
  private List<Integer> campaignGroups = null;


  public UpdateCampaign name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A user-facing name for this campaign.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A user-facing name for this campaign.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateCampaign description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A detailed description of the campaign.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A detailed description of the campaign.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateCampaign startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Timestamp when the campaign will become active.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the campaign will become active.")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public UpdateCampaign endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Timestamp when the campaign will become inactive.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the campaign will become inactive.")

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public UpdateCampaign attributes(Object attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Arbitrary properties associated with this campaign
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arbitrary properties associated with this campaign")

  public Object getAttributes() {
    return attributes;
  }


  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  public UpdateCampaign state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * A disabled or archived campaign is not evaluated for rules or coupons. 
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A disabled or archived campaign is not evaluated for rules or coupons. ")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public UpdateCampaign activeRulesetId(Integer activeRulesetId) {
    
    this.activeRulesetId = activeRulesetId;
    return this;
  }

   /**
   * ID of Ruleset this campaign applies on customer session evaluation.
   * @return activeRulesetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of Ruleset this campaign applies on customer session evaluation.")

  public Integer getActiveRulesetId() {
    return activeRulesetId;
  }


  public void setActiveRulesetId(Integer activeRulesetId) {
    this.activeRulesetId = activeRulesetId;
  }


  public UpdateCampaign tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public UpdateCampaign addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of tags for the campaign.
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "A list of tags for the campaign.")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public UpdateCampaign features(List<FeaturesEnum> features) {
    
    this.features = features;
    return this;
  }

  public UpdateCampaign addFeaturesItem(FeaturesEnum featuresItem) {
    this.features.add(featuresItem);
    return this;
  }

   /**
   * A list of features for the campaign.
   * @return features
  **/
  @ApiModelProperty(required = true, value = "A list of features for the campaign.")

  public List<FeaturesEnum> getFeatures() {
    return features;
  }


  public void setFeatures(List<FeaturesEnum> features) {
    this.features = features;
  }


  public UpdateCampaign couponSettings(CodeGeneratorSettings couponSettings) {
    
    this.couponSettings = couponSettings;
    return this;
  }

   /**
   * Get couponSettings
   * @return couponSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CodeGeneratorSettings getCouponSettings() {
    return couponSettings;
  }


  public void setCouponSettings(CodeGeneratorSettings couponSettings) {
    this.couponSettings = couponSettings;
  }


  public UpdateCampaign referralSettings(CodeGeneratorSettings referralSettings) {
    
    this.referralSettings = referralSettings;
    return this;
  }

   /**
   * Get referralSettings
   * @return referralSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CodeGeneratorSettings getReferralSettings() {
    return referralSettings;
  }


  public void setReferralSettings(CodeGeneratorSettings referralSettings) {
    this.referralSettings = referralSettings;
  }


  public UpdateCampaign limits(List<LimitConfig> limits) {
    
    this.limits = limits;
    return this;
  }

  public UpdateCampaign addLimitsItem(LimitConfig limitsItem) {
    this.limits.add(limitsItem);
    return this;
  }

   /**
   * The set of limits that will operate for this campaign
   * @return limits
  **/
  @ApiModelProperty(required = true, value = "The set of limits that will operate for this campaign")

  public List<LimitConfig> getLimits() {
    return limits;
  }


  public void setLimits(List<LimitConfig> limits) {
    this.limits = limits;
  }


  public UpdateCampaign campaignGroups(List<Integer> campaignGroups) {
    
    this.campaignGroups = campaignGroups;
    return this;
  }

  public UpdateCampaign addCampaignGroupsItem(Integer campaignGroupsItem) {
    if (this.campaignGroups == null) {
      this.campaignGroups = new ArrayList<Integer>();
    }
    this.campaignGroups.add(campaignGroupsItem);
    return this;
  }

   /**
   * The IDs of the campaign groups that own this entity.
   * @return campaignGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the campaign groups that own this entity.")

  public List<Integer> getCampaignGroups() {
    return campaignGroups;
  }


  public void setCampaignGroups(List<Integer> campaignGroups) {
    this.campaignGroups = campaignGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCampaign updateCampaign = (UpdateCampaign) o;
    return Objects.equals(this.name, updateCampaign.name) &&
        Objects.equals(this.description, updateCampaign.description) &&
        Objects.equals(this.startTime, updateCampaign.startTime) &&
        Objects.equals(this.endTime, updateCampaign.endTime) &&
        Objects.equals(this.attributes, updateCampaign.attributes) &&
        Objects.equals(this.state, updateCampaign.state) &&
        Objects.equals(this.activeRulesetId, updateCampaign.activeRulesetId) &&
        Objects.equals(this.tags, updateCampaign.tags) &&
        Objects.equals(this.features, updateCampaign.features) &&
        Objects.equals(this.couponSettings, updateCampaign.couponSettings) &&
        Objects.equals(this.referralSettings, updateCampaign.referralSettings) &&
        Objects.equals(this.limits, updateCampaign.limits) &&
        Objects.equals(this.campaignGroups, updateCampaign.campaignGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, startTime, endTime, attributes, state, activeRulesetId, tags, features, couponSettings, referralSettings, limits, campaignGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCampaign {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    activeRulesetId: ").append(toIndentedString(activeRulesetId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    couponSettings: ").append(toIndentedString(couponSettings)).append("\n");
    sb.append("    referralSettings: ").append(toIndentedString(referralSettings)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    campaignGroups: ").append(toIndentedString(campaignGroups)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

