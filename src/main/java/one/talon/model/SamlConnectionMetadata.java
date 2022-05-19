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
import java.math.BigDecimal;

/**
 * SamlConnectionMetadata
 */

public class SamlConnectionMetadata {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private BigDecimal accountId;

  public static final String SERIALIZED_NAME_METADATA_DOCUMENT = "metadataDocument";
  @SerializedName(SERIALIZED_NAME_METADATA_DOCUMENT)
  private String metadataDocument;


  public SamlConnectionMetadata name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * ID of the SAML service.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "ID of the SAML service.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SamlConnectionMetadata enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Determines if this SAML connection active.
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "Determines if this SAML connection active.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public SamlConnectionMetadata accountId(BigDecimal accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getAccountId() {
    return accountId;
  }


  public void setAccountId(BigDecimal accountId) {
    this.accountId = accountId;
  }


  public SamlConnectionMetadata metadataDocument(String metadataDocument) {
    
    this.metadataDocument = metadataDocument;
    return this;
  }

   /**
   * Identity Provider metadata XML document.
   * @return metadataDocument
  **/
  @ApiModelProperty(required = true, value = "Identity Provider metadata XML document.")

  public String getMetadataDocument() {
    return metadataDocument;
  }


  public void setMetadataDocument(String metadataDocument) {
    this.metadataDocument = metadataDocument;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlConnectionMetadata samlConnectionMetadata = (SamlConnectionMetadata) o;
    return Objects.equals(this.name, samlConnectionMetadata.name) &&
        Objects.equals(this.enabled, samlConnectionMetadata.enabled) &&
        Objects.equals(this.accountId, samlConnectionMetadata.accountId) &&
        Objects.equals(this.metadataDocument, samlConnectionMetadata.metadataDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, enabled, accountId, metadataDocument);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlConnectionMetadata {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    metadataDocument: ").append(toIndentedString(metadataDocument)).append("\n");
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

