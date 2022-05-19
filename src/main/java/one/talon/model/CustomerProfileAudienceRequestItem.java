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

/**
 * CustomerProfileAudienceRequestItem
 */

public class CustomerProfileAudienceRequestItem {
  /**
   * Defines the action to perform: - &#x60;add&#x60;: Adds the customer profile to the audience. - &#x60;delete&#x60;: Removes the customer profile from the audience. 
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    ADD("add"),
    
    DELETE("delete");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  public static final String SERIALIZED_NAME_PROFILE_INTEGRATION_ID = "profileIntegrationId";
  @SerializedName(SERIALIZED_NAME_PROFILE_INTEGRATION_ID)
  private String profileIntegrationId;

  public static final String SERIALIZED_NAME_AUDIENCE_ID = "audienceId";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_ID)
  private Integer audienceId;


  public CustomerProfileAudienceRequestItem action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * Defines the action to perform: - &#x60;add&#x60;: Adds the customer profile to the audience. - &#x60;delete&#x60;: Removes the customer profile from the audience. 
   * @return action
  **/
  @ApiModelProperty(example = "add", required = true, value = "Defines the action to perform: - `add`: Adds the customer profile to the audience. - `delete`: Removes the customer profile from the audience. ")

  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public CustomerProfileAudienceRequestItem profileIntegrationId(String profileIntegrationId) {
    
    this.profileIntegrationId = profileIntegrationId;
    return this;
  }

   /**
   * The ID of this customer profile in the third-party integration.
   * @return profileIntegrationId
  **/
  @ApiModelProperty(example = "R195412", required = true, value = "The ID of this customer profile in the third-party integration.")

  public String getProfileIntegrationId() {
    return profileIntegrationId;
  }


  public void setProfileIntegrationId(String profileIntegrationId) {
    this.profileIntegrationId = profileIntegrationId;
  }


  public CustomerProfileAudienceRequestItem audienceId(Integer audienceId) {
    
    this.audienceId = audienceId;
    return this;
  }

   /**
   * The ID of the audience. You get it via the &#x60;id&#x60; property when [creating an audience](#operation/createAudienceV2).
   * @return audienceId
  **/
  @ApiModelProperty(example = "748", required = true, value = "The ID of the audience. You get it via the `id` property when [creating an audience](#operation/createAudienceV2).")

  public Integer getAudienceId() {
    return audienceId;
  }


  public void setAudienceId(Integer audienceId) {
    this.audienceId = audienceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerProfileAudienceRequestItem customerProfileAudienceRequestItem = (CustomerProfileAudienceRequestItem) o;
    return Objects.equals(this.action, customerProfileAudienceRequestItem.action) &&
        Objects.equals(this.profileIntegrationId, customerProfileAudienceRequestItem.profileIntegrationId) &&
        Objects.equals(this.audienceId, customerProfileAudienceRequestItem.audienceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, profileIntegrationId, audienceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerProfileAudienceRequestItem {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    profileIntegrationId: ").append(toIndentedString(profileIntegrationId)).append("\n");
    sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
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

