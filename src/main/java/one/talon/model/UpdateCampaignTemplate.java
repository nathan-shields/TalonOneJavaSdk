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
import one.talon.model.CampaignTemplateCollection;
import one.talon.model.CampaignTemplateParams;
import one.talon.model.CodeGeneratorSettings;
import one.talon.model.TemplateLimitConfig;

/**
 * UpdateCampaignTemplate
 */

public class UpdateCampaignTemplate {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INSTRUCTIONS = "instructions";
  @SerializedName(SERIALIZED_NAME_INSTRUCTIONS)
  private String instructions;

  public static final String SERIALIZED_NAME_CAMPAIGN_ATTRIBUTES = "campaignAttributes";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ATTRIBUTES)
  private Object campaignAttributes;

  public static final String SERIALIZED_NAME_COUPON_ATTRIBUTES = "couponAttributes";
  @SerializedName(SERIALIZED_NAME_COUPON_ATTRIBUTES)
  private Object couponAttributes;

  /**
   * Only Campaign Templates in &#39;available&#39; state may be used to create Campaigns.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    DRAFT("draft"),
    
    ENABLED("enabled"),
    
    DISABLED("disabled");

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
  private StateEnum state;

  public static final String SERIALIZED_NAME_ACTIVE_RULESET_ID = "activeRulesetId";
  @SerializedName(SERIALIZED_NAME_ACTIVE_RULESET_ID)
  private Integer activeRulesetId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

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
  private List<FeaturesEnum> features = null;

  public static final String SERIALIZED_NAME_COUPON_SETTINGS = "couponSettings";
  @SerializedName(SERIALIZED_NAME_COUPON_SETTINGS)
  private CodeGeneratorSettings couponSettings;

  public static final String SERIALIZED_NAME_REFERRAL_SETTINGS = "referralSettings";
  @SerializedName(SERIALIZED_NAME_REFERRAL_SETTINGS)
  private CodeGeneratorSettings referralSettings;

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private List<TemplateLimitConfig> limits = null;

  public static final String SERIALIZED_NAME_TEMPLATE_PARAMS = "templateParams";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_PARAMS)
  private List<CampaignTemplateParams> templateParams = null;

  public static final String SERIALIZED_NAME_APPLICATIONS_IDS = "applicationsIds";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS_IDS)
  private List<Integer> applicationsIds = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_CAMPAIGN_COLLECTIONS = "campaignCollections";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_COLLECTIONS)
  private List<CampaignTemplateCollection> campaignCollections = null;


  public UpdateCampaignTemplate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The campaign template name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The campaign template name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateCampaignTemplate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Customer-facing text that explains the objective of the template.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Customer-facing text that explains the objective of the template.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateCampaignTemplate instructions(String instructions) {
    
    this.instructions = instructions;
    return this;
  }

   /**
   * Customer-facing text that explains how to use the template. For example, you can use this property to explain the available attributes of this template, and how they can be modified when a user uses this template to create a new campaign.
   * @return instructions
  **/
  @ApiModelProperty(required = true, value = "Customer-facing text that explains how to use the template. For example, you can use this property to explain the available attributes of this template, and how they can be modified when a user uses this template to create a new campaign.")

  public String getInstructions() {
    return instructions;
  }


  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }


  public UpdateCampaignTemplate campaignAttributes(Object campaignAttributes) {
    
    this.campaignAttributes = campaignAttributes;
    return this;
  }

   /**
   * The Campaign Attributes that Campaigns created from this template will have by default.
   * @return campaignAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Campaign Attributes that Campaigns created from this template will have by default.")

  public Object getCampaignAttributes() {
    return campaignAttributes;
  }


  public void setCampaignAttributes(Object campaignAttributes) {
    this.campaignAttributes = campaignAttributes;
  }


  public UpdateCampaignTemplate couponAttributes(Object couponAttributes) {
    
    this.couponAttributes = couponAttributes;
    return this;
  }

   /**
   * The Campaign Attributes that Coupons created from this template will have by default.
   * @return couponAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Campaign Attributes that Coupons created from this template will have by default.")

  public Object getCouponAttributes() {
    return couponAttributes;
  }


  public void setCouponAttributes(Object couponAttributes) {
    this.couponAttributes = couponAttributes;
  }


  public UpdateCampaignTemplate state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Only Campaign Templates in &#39;available&#39; state may be used to create Campaigns.
   * @return state
  **/
  @ApiModelProperty(required = true, value = "Only Campaign Templates in 'available' state may be used to create Campaigns.")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public UpdateCampaignTemplate activeRulesetId(Integer activeRulesetId) {
    
    this.activeRulesetId = activeRulesetId;
    return this;
  }

   /**
   * The ID of the Ruleset this Campaign Template will use.
   * @return activeRulesetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the Ruleset this Campaign Template will use.")

  public Integer getActiveRulesetId() {
    return activeRulesetId;
  }


  public void setActiveRulesetId(Integer activeRulesetId) {
    this.activeRulesetId = activeRulesetId;
  }


  public UpdateCampaignTemplate tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public UpdateCampaignTemplate addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of tags for the campaign template.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of tags for the campaign template.")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public UpdateCampaignTemplate features(List<FeaturesEnum> features) {
    
    this.features = features;
    return this;
  }

  public UpdateCampaignTemplate addFeaturesItem(FeaturesEnum featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<FeaturesEnum>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * A list of features for the campaign template.
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of features for the campaign template.")

  public List<FeaturesEnum> getFeatures() {
    return features;
  }


  public void setFeatures(List<FeaturesEnum> features) {
    this.features = features;
  }


  public UpdateCampaignTemplate couponSettings(CodeGeneratorSettings couponSettings) {
    
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


  public UpdateCampaignTemplate referralSettings(CodeGeneratorSettings referralSettings) {
    
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


  public UpdateCampaignTemplate limits(List<TemplateLimitConfig> limits) {
    
    this.limits = limits;
    return this;
  }

  public UpdateCampaignTemplate addLimitsItem(TemplateLimitConfig limitsItem) {
    if (this.limits == null) {
      this.limits = new ArrayList<TemplateLimitConfig>();
    }
    this.limits.add(limitsItem);
    return this;
  }

   /**
   * The set of limits that will operate for this campaign template
   * @return limits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The set of limits that will operate for this campaign template")

  public List<TemplateLimitConfig> getLimits() {
    return limits;
  }


  public void setLimits(List<TemplateLimitConfig> limits) {
    this.limits = limits;
  }


  public UpdateCampaignTemplate templateParams(List<CampaignTemplateParams> templateParams) {
    
    this.templateParams = templateParams;
    return this;
  }

  public UpdateCampaignTemplate addTemplateParamsItem(CampaignTemplateParams templateParamsItem) {
    if (this.templateParams == null) {
      this.templateParams = new ArrayList<CampaignTemplateParams>();
    }
    this.templateParams.add(templateParamsItem);
    return this;
  }

   /**
   * Template parameters are fields which can be used to replace values in a rule.
   * @return templateParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template parameters are fields which can be used to replace values in a rule.")

  public List<CampaignTemplateParams> getTemplateParams() {
    return templateParams;
  }


  public void setTemplateParams(List<CampaignTemplateParams> templateParams) {
    this.templateParams = templateParams;
  }


  public UpdateCampaignTemplate applicationsIds(List<Integer> applicationsIds) {
    
    this.applicationsIds = applicationsIds;
    return this;
  }

  public UpdateCampaignTemplate addApplicationsIdsItem(Integer applicationsIdsItem) {
    this.applicationsIds.add(applicationsIdsItem);
    return this;
  }

   /**
   * A list of the IDs of the applications that are subscribed to this campaign template
   * @return applicationsIds
  **/
  @ApiModelProperty(required = true, value = "A list of the IDs of the applications that are subscribed to this campaign template")

  public List<Integer> getApplicationsIds() {
    return applicationsIds;
  }


  public void setApplicationsIds(List<Integer> applicationsIds) {
    this.applicationsIds = applicationsIds;
  }


  public UpdateCampaignTemplate campaignCollections(List<CampaignTemplateCollection> campaignCollections) {
    
    this.campaignCollections = campaignCollections;
    return this;
  }

  public UpdateCampaignTemplate addCampaignCollectionsItem(CampaignTemplateCollection campaignCollectionsItem) {
    if (this.campaignCollections == null) {
      this.campaignCollections = new ArrayList<CampaignTemplateCollection>();
    }
    this.campaignCollections.add(campaignCollectionsItem);
    return this;
  }

   /**
   * The campaign collections from the blueprint campaign for the template.
   * @return campaignCollections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The campaign collections from the blueprint campaign for the template.")

  public List<CampaignTemplateCollection> getCampaignCollections() {
    return campaignCollections;
  }


  public void setCampaignCollections(List<CampaignTemplateCollection> campaignCollections) {
    this.campaignCollections = campaignCollections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCampaignTemplate updateCampaignTemplate = (UpdateCampaignTemplate) o;
    return Objects.equals(this.name, updateCampaignTemplate.name) &&
        Objects.equals(this.description, updateCampaignTemplate.description) &&
        Objects.equals(this.instructions, updateCampaignTemplate.instructions) &&
        Objects.equals(this.campaignAttributes, updateCampaignTemplate.campaignAttributes) &&
        Objects.equals(this.couponAttributes, updateCampaignTemplate.couponAttributes) &&
        Objects.equals(this.state, updateCampaignTemplate.state) &&
        Objects.equals(this.activeRulesetId, updateCampaignTemplate.activeRulesetId) &&
        Objects.equals(this.tags, updateCampaignTemplate.tags) &&
        Objects.equals(this.features, updateCampaignTemplate.features) &&
        Objects.equals(this.couponSettings, updateCampaignTemplate.couponSettings) &&
        Objects.equals(this.referralSettings, updateCampaignTemplate.referralSettings) &&
        Objects.equals(this.limits, updateCampaignTemplate.limits) &&
        Objects.equals(this.templateParams, updateCampaignTemplate.templateParams) &&
        Objects.equals(this.applicationsIds, updateCampaignTemplate.applicationsIds) &&
        Objects.equals(this.campaignCollections, updateCampaignTemplate.campaignCollections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, instructions, campaignAttributes, couponAttributes, state, activeRulesetId, tags, features, couponSettings, referralSettings, limits, templateParams, applicationsIds, campaignCollections);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCampaignTemplate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    campaignAttributes: ").append(toIndentedString(campaignAttributes)).append("\n");
    sb.append("    couponAttributes: ").append(toIndentedString(couponAttributes)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    activeRulesetId: ").append(toIndentedString(activeRulesetId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    couponSettings: ").append(toIndentedString(couponSettings)).append("\n");
    sb.append("    referralSettings: ").append(toIndentedString(referralSettings)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    templateParams: ").append(toIndentedString(templateParams)).append("\n");
    sb.append("    applicationsIds: ").append(toIndentedString(applicationsIds)).append("\n");
    sb.append("    campaignCollections: ").append(toIndentedString(campaignCollections)).append("\n");
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

