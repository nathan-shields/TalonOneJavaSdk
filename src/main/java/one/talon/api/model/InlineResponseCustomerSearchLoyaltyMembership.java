/*
 * Talon.One API
 * The Talon.One API is used to manage applications and campaigns, as well as to integrate with your application. The operations in the _Integration API_ section are used to integrate with our platform, while the other operations are used to manage applications and campaigns.  ### Where is the API?  The API is available at the same hostname as these docs. For example, if you are reading this page at `https://mycompany.talon.one/docs/api/`, the URL for the [updateCustomerProfile][] operation is `https://mycompany.talon.one/v1/customer_profiles/id`  [updateCustomerProfile]: #operation--v1-customer_profiles--integrationId--put
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package one.talon.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * InlineResponse20014LoyaltyMemberships
 */

public class InlineResponseCustomerSearchLoyaltyMembership {
    @SerializedName("joined")
    private OffsetDateTime joined = null;

    @SerializedName("loyaltyProgramId")
    private Integer loyaltyProgramId = null;

    public InlineResponseCustomerSearchLoyaltyMembership joined(OffsetDateTime joined) {
        this.joined = joined;
        return this;
    }

    /**
     * The moment in which the loyalty program was joined.
     * @return joined
     **/
    @ApiModelProperty(value = "The moment in which the loyalty program was joined.")
    public OffsetDateTime getJoined() {
        return joined;
    }

    public void setJoined(OffsetDateTime joined) {
        this.joined = joined;
    }

    public InlineResponseCustomerSearchLoyaltyMembership loyaltyProgramId(Integer loyaltyProgramId) {
        this.loyaltyProgramId = loyaltyProgramId;
        return this;
    }

    /**
     * The ID of the loyalty program belonging to this entity.
     * @return loyaltyProgramId
     **/
    @ApiModelProperty(required = true, value = "The ID of the loyalty program belonging to this entity.")
    public Integer getLoyaltyProgramId() {
        return loyaltyProgramId;
    }

    public void setLoyaltyProgramId(Integer loyaltyProgramId) {
        this.loyaltyProgramId = loyaltyProgramId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InlineResponseCustomerSearchLoyaltyMembership inlineResponse20014LoyaltyMemberships = (InlineResponseCustomerSearchLoyaltyMembership) o;
        return Objects.equals(this.joined, inlineResponse20014LoyaltyMemberships.joined) &&
                Objects.equals(this.loyaltyProgramId, inlineResponse20014LoyaltyMemberships.loyaltyProgramId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(joined, loyaltyProgramId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse20014LoyaltyMemberships {\n");

        sb.append("    joined: ").append(toIndentedString(joined)).append("\n");
        sb.append("    loyaltyProgramId: ").append(toIndentedString(loyaltyProgramId)).append("\n");
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

