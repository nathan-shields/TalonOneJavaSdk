/*
 * Talon.One API
 * Use the Talon.One API to integrate with your application and to manage applications and campaigns:  - Use the operations in the [Integration API section](#integration-api) are used to integrate with our platform - Use the operation in the [Management API section](#management-api) to manage applications and campaigns.  ## Determining the base URL of the endpoints  The API is available at the same hostname as your Campaign Manager deployment. For example, if you access the Campaign Manager at `https://yourbaseurl.talon.one/`, the URL for the [updateCustomerSessionV2](https://docs.talon.one/integration-api#operation/updateCustomerSessionV2) endpoint is `https://yourbaseurl.talon.one/v2/customer_sessions/{Id}` 
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package one.talon.api;

import one.talon.ApiException;
import one.talon.model.Audience;
import one.talon.model.Catalog;
import one.talon.model.CatalogSyncRequest;
import one.talon.model.Coupon;
import one.talon.model.CouponReservations;
import one.talon.model.CustomerInventory;
import one.talon.model.CustomerProfileAudienceRequest;
import one.talon.model.CustomerProfileIntegrationRequestV2;
import one.talon.model.CustomerProfileIntegrationResponseV2;
import one.talon.model.ErrorResponse;
import one.talon.model.ErrorResponseWithStatus;
import one.talon.model.InlineResponse200;
import one.talon.model.InlineResponse2001;
import one.talon.model.InlineResponse2002;
import one.talon.model.InlineResponse201;
import one.talon.model.IntegrationCustomerSessionResponse;
import one.talon.model.IntegrationEventV2Request;
import one.talon.model.IntegrationRequest;
import one.talon.model.IntegrationStateV2;
import one.talon.model.LoyaltyBalances;
import one.talon.model.LoyaltyCard;
import one.talon.model.LoyaltyCardRegistration;
import one.talon.model.MultipleCustomerProfileIntegrationRequest;
import one.talon.model.MultipleCustomerProfileIntegrationResponseV2;
import one.talon.model.NewAudience;
import one.talon.model.NewReferral;
import one.talon.model.NewReferralsForMultipleAdvocates;
import org.threeten.bp.OffsetDateTime;
import one.talon.model.Referral;
import one.talon.model.ReopenSessionResponse;
import one.talon.model.ReturnIntegrationRequest;
import one.talon.model.TrackEventV2Response;
import one.talon.model.UpdateAudience;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IntegrationApi
 */
@Ignore
public class IntegrationApiTest {

    private final IntegrationApi api = new IntegrationApi();

    
    /**
     * Create audience
     *
     * Create an audience. The audience can be created directly from scratch or can come from third party platforms.  **Note:** Audiences can also be created from scratch via the Campaign Manager. See the [docs](https://docs.talon.one/docs/product/audiences/creating-audiences).  To create an audience from an existing audience from a [technology partner](https://docs.talon.one/docs/dev/technology-partners/overview): 1. Set the &#x60;integration&#x60; property to &#x60;mparticle&#x60;, &#x60;segment&#x60; etc., depending on a third-party platform. 1. Set &#x60;integrationId&#x60; to the ID of this audience in a third-party platform.  To create an audience from an existing audience in another platform: 1. Do not use the &#x60;integration&#x60; property. 1. Set &#x60;integrationId&#x60; to the ID of this audience in the 3rd-party platform.  To create an audience from scratch: 1. Only set the &#x60;name&#x60; property.  Once you create your first audience, audience-specific rule conditions are enabled in the Rule Builder. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAudienceV2Test() throws ApiException {
        NewAudience body = null;
        Audience response = api.createAudienceV2(body);

        // TODO: test validations
    }
    
    /**
     * Create coupon reservation
     *
     * Create a coupon reservation for specified customer profiles on the specified coupon. You can also create a reservation via the Campaign Manager using the [Create coupon code reservation effect](https://docs.talon.one/docs/product/rules/effects/using-effects#reserving-a-coupon-code).  Reserving a coupon allows you to associate a coupon code to a given customer(s). You can then list the reserved coupons of a given customer with the [List customer data](https://docs.talon.one/integration-api#operation/getCustomerInventory) endpoint.  If a coupon gets created for a specific user, it will automatically appear in their coupons.  When a user redeems a coupon, a reservation is automatically created after the redemption and the used coupon will be returned in the [List customer data](https://docs.talon.one/integration-api#operation/getCustomerInventory) endpoint.  For example, you can use this endpoint and &#x60;List customer data&#x60; to create a _coupon wallet_ by reserving coupon codes for a customer, and then displaying their coupon wallet when they visit your store.  If the **Coupon visibility** checkbox was selected when [creating a universal code](https://docs.talon.one/docs/product/campaigns/coupons/creating-coupons#generating-a-universal-code), the coupon code is implicitly reserved for all customers, and the code will be returned for all customer profiles in the [List customer data](https://docs.talon.one/integration-api#operation/getCustomerInventory) endpoint.  &lt;div class&#x3D;\&quot;redoc-section\&quot;&gt;   &lt;p class&#x3D;\&quot;title\&quot;&gt;Important&lt;/p&gt;    This endpoint creates a **soft** reservation. _Any_ customer   can use a reserved coupon code and proceed to checkout.    To create a hard reservation, you can:   - use the [Create coupons](https://docs.talon.one/management-api#operation/createCoupons) endpoint or,   - use the [Create coupons for multiple recipients](https://docs.talon.one/management-api#operation/createCouponsForMultipleRecipients)     endpoint setting the &#x60;recipientsIntegrationId&#x60; property or,   - create a coupon code with the **Reservation mandatory** option then use the [Create coupon code reservation effect](https://docs.talon.one/docs/product/rules/effects/using-effects#reserving-a-coupon-code). &lt;/div&gt;  To delete a reservation, use the [Delete reservation](https://docs.talon.one/integration-api#tag/Coupons/operation/deleteCouponReservation) endpoint. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCouponReservationTest() throws ApiException {
        String couponValue = null;
        CouponReservations body = null;
        Coupon response = api.createCouponReservation(couponValue, body);

        // TODO: test validations
    }
    
    /**
     * Create referral code for an advocate
     *
     * Creates a referral code for an advocate. The code will be valid for the referral campaign for which is created, indicated in the &#x60;campaignId&#x60; parameter, and will be associated with the profile specified in the &#x60;advocateProfileIntegrationId&#x60; parameter as the advocate&#39;s profile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReferralTest() throws ApiException {
        NewReferral body = null;
        Referral response = api.createReferral(body);

        // TODO: test validations
    }
    
    /**
     * Create referral codes for multiple advocates
     *
     * Creates unique referral codes for multiple advocates. The code will be valid for the referral campaign for which it is created, indicated in the &#x60;campaignId&#x60; parameter, and one referral code will be associated with one advocate using the profile specified in the &#x60;advocateProfileIntegrationId&#x60; parameter as the advocate&#39;s profile. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReferralsForMultipleAdvocatesTest() throws ApiException {
        NewReferralsForMultipleAdvocates body = null;
        String silent = null;
        InlineResponse201 response = api.createReferralsForMultipleAdvocates(body, silent);

        // TODO: test validations
    }
    
    /**
     * Delete audience memberships
     *
     * Remove all members from this audience. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAudienceMembershipsV2Test() throws ApiException {
        Integer audienceId = null;
        api.deleteAudienceMembershipsV2(audienceId);

        // TODO: test validations
    }
    
    /**
     * Delete audience
     *
     * Delete an audience created by a third-party integration.  **Warning:** This endpoint also removes any associations recorded between a customer profile and this audience.  **Note:** Audiences can also be deleted via the Campaign Manager. See the [docs](https://docs.talon.one/docs/product/audiences/managing-audiences#deleting-an-audience). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAudienceV2Test() throws ApiException {
        Integer audienceId = null;
        api.deleteAudienceV2(audienceId);

        // TODO: test validations
    }
    
    /**
     * Delete coupon reservations
     *
     * Remove all the coupon reservations from the provided customer profile integration IDs and the provided coupon code. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCouponReservationTest() throws ApiException {
        String couponValue = null;
        CouponReservations body = null;
        api.deleteCouponReservation(couponValue, body);

        // TODO: test validations
    }
    
    /**
     * Delete customer&#39;s personal data
     *
     * Delete all attributes on the customer profile and on entities that reference this customer profile.  **Important:** To preserve performance, we recommend avoiding deleting customer data during peak-traffic hours. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomerDataTest() throws ApiException {
        String integrationId = null;
        api.deleteCustomerData(integrationId);

        // TODO: test validations
    }
    
    /**
     * List customer data
     *
     * Return the customer inventory regarding entities referencing this customer profile&#39;s &#x60;integrationId&#x60;.  Typical entities returned are: customer profile information, referral codes, loyalty points, loyalty cards and reserved coupons. Reserved coupons also include redeemed coupons. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerInventoryTest() throws ApiException {
        String integrationId = null;
        Boolean profile = null;
        Boolean referrals = null;
        Boolean coupons = null;
        Boolean loyalty = null;
        Boolean giveaways = null;
        CustomerInventory response = api.getCustomerInventory(integrationId, profile, referrals, coupons, loyalty, giveaways);

        // TODO: test validations
    }
    
    /**
     * Get customer session
     *
     * Get the details of the given customer session.  You can get the same data via other endpoints that also apply changes, which can help you save requests and increase performance. See:  - [Update customer session](#tag/Customer-sessions/operation/updateCustomerSessionV2) - [Update customer profile](#tag/Customer-profiles/operation/updateCustomerProfileV2) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerSessionTest() throws ApiException {
        String customerSessionId = null;
        IntegrationCustomerSessionResponse response = api.getCustomerSession(customerSessionId);

        // TODO: test validations
    }
    
    /**
     * Get customer&#39;s loyalty points
     *
     * Retrieve loyalty ledger balances for the given Integration ID in the specified loyalty program. You can filter balances by date. If no filtering options are applied, you retrieve all loyalty balances on the current date for the given integration ID.  Loyalty balances are calculated when Talon.One receives your request using the points stored in our database, so retrieving a large number of balances at once can impact performance.  **Note:** For more information, see: - [Managing card-based loyalty program data](https://docs.talon.one/docs/product/loyalty-programs/card-based/managing-loyalty-cards) - [Managing profile-based loyalty program data](https://docs.talon.one/docs/product/loyalty-programs/profile-based/managing-pb-lp-data) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoyaltyBalancesTest() throws ApiException {
        Integer loyaltyProgramId = null;
        String integrationId = null;
        OffsetDateTime endDate = null;
        LoyaltyBalances response = api.getLoyaltyBalances(loyaltyProgramId, integrationId, endDate);

        // TODO: test validations
    }
    
    /**
     * Get card&#39;s point balances
     *
     * Retrieve loyalty balances for the given loyalty card in the specified loyalty program with filtering options applied. If no filtering options are applied, all loyalty balances for the given loyalty card are returned. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoyaltyCardBalancesTest() throws ApiException {
        Integer loyaltyProgramId = null;
        String loyaltyCardId = null;
        OffsetDateTime endDate = null;
        LoyaltyBalances response = api.getLoyaltyCardBalances(loyaltyProgramId, loyaltyCardId, endDate);

        // TODO: test validations
    }
    
    /**
     * List card&#39;s transactions
     *
     * Retrieve loyalty transaction logs for the given loyalty card in the specified loyalty program with filtering options applied. If no filtering options are applied, the last 50 loyalty transactions for the given loyalty card are returned. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoyaltyCardTransactionsTest() throws ApiException {
        Integer loyaltyProgramId = null;
        String loyaltyCardId = null;
        String subledgerId = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        Integer pageSize = null;
        Integer skip = null;
        InlineResponse2001 response = api.getLoyaltyCardTransactions(loyaltyProgramId, loyaltyCardId, subledgerId, startDate, endDate, pageSize, skip);

        // TODO: test validations
    }
    
    /**
     * List customer&#39;s loyalty transactions
     *
     * Retrieve paginated results of loyalty transaction logs for the given Integration ID in the specified loyalty program.  You can filter transactions by date. If no filters are applied, the last 50 loyalty transactions for the given integration ID are returned.  **Note:** To retrieve all loyalty program transaction logs in a given loyalty program, use the [List loyalty program transactions](https://docs.talon.one/management-api#tag/Loyalty/operation/getLoyaltyProgramTransactions) endpoint. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoyaltyProgramProfileTransactionsTest() throws ApiException {
        Integer loyaltyProgramId = null;
        String integrationId = null;
        String subledgerId = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        Integer pageSize = null;
        Integer skip = null;
        InlineResponse2002 response = api.getLoyaltyProgramProfileTransactions(loyaltyProgramId, integrationId, subledgerId, startDate, endDate, pageSize, skip);

        // TODO: test validations
    }
    
    /**
     * List customers that have this coupon reserved
     *
     * Return all customers that have this coupon marked as reserved.  Coupons are reserved in the following ways: - To create a soft reservation (any customer can use the coupon), use the [Create coupon reservation](#operation/createCouponReservation) endpoint. - To create a hard reservation (only the given customer can use the coupon), create a coupon in the Campaign Manager for a given &#x60;recipientIntegrationId&#x60; or use the [Create coupons](https://docs.talon.one/management-api#operation/createCoupons) or [Create coupons for multiple recipients](https://docs.talon.one/management-api#operation/createCouponsForMultipleRecipients) endpoints. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReservedCustomersTest() throws ApiException {
        String couponValue = null;
        InlineResponse200 response = api.getReservedCustomers(couponValue);

        // TODO: test validations
    }
    
    /**
     * Link customer profile to card
     *
     * [Loyalty cards](https://docs.talon.one/docs/product/loyalty-programs/card-based/card-based-overview) allow customers to collect and spend loyalty points within a [card-based loyalty program](https://docs.talon.one/docs/product/loyalty-programs/overview#loyalty-program-types). They are useful to gamify loyalty programs and can be used with or without customer profiles linked to them.  Link a customer profile to a given loyalty card for the card to be set as **Registered**. This affects how it can be used. See the [docs](https://docs.talon.one/docs/product/loyalty-programs/card-based/managing-loyalty-cards#linking-customer-profiles-to-a-loyalty-card).  **Note:** You can link as many customer profiles to a given loyalty card as the [**card user limit**](https://docs.talon.one/docs/product/loyalty-programs/card-based/creating-cb-programs) allows. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void linkLoyaltyCardToProfileTest() throws ApiException {
        Integer loyaltyProgramId = null;
        String loyaltyCardId = null;
        LoyaltyCardRegistration body = null;
        LoyaltyCard response = api.linkLoyaltyCardToProfile(loyaltyProgramId, loyaltyCardId, body);

        // TODO: test validations
    }
    
    /**
     * Reopen customer session
     *
     * Reopen a closed [customer session](https://docs.talon.one/docs/dev/concepts/entities#customer-session). For example, if a session has been completed but still needs to be edited, you can reopen it with this endpoint. A reopen session is treated like a standard open session.  When reopening a session: - The &#x60;talon_session_reopened&#x60; event is triggered. You can see it in the **Events** view in the Campaign Manager. - The session state is updated to &#x60;open&#x60;. - Modified budgets and triggered effects when the session was closed are rolled back except for the list below.  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Effects and budgets unimpacted by a session reopening&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;     &lt;p&gt;The following effects and budgets are left the way they were once the session was originally closed:&lt;/p&gt;     &lt;ul&gt;       &lt;li&gt;Add free item effect&lt;/li&gt;       &lt;li&gt;Any &lt;strong&gt;not pending&lt;/strong&gt; pending loyalty points.&lt;/li&gt;       &lt;li&gt;Award giveaway&lt;/li&gt;       &lt;li&gt;Coupon and referral creation&lt;/li&gt;       &lt;li&gt;Coupon reservation&lt;/li&gt;       &lt;li&gt;Custom effect&lt;/li&gt;       &lt;li&gt;Update attribute value&lt;/li&gt;       &lt;li&gt;Update cart item attribute value&lt;/li&gt;     &lt;/ul&gt;   &lt;/div&gt; &lt;p&gt;To see an example of roll back, see the &lt;a href&#x3D;\&quot;https://docs.talon.one/docs/dev/tutorials/rolling-back-effects\&quot;&gt;Cancelling a session with campaign budgets tutorial&lt;/a&gt;.&lt;/p&gt; &lt;/details&gt;  **Note:** If your order workflow requires you to create a new session instead of reopening a session, use the [Update customer session](https://docs.talon.one/integration-api#tag/Customer-sessions/operation/updateCustomerSessionV2) endpoint to cancel a closed session and create a new one. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reopenCustomerSessionTest() throws ApiException {
        String customerSessionId = null;
        ReopenSessionResponse response = api.reopenCustomerSession(customerSessionId);

        // TODO: test validations
    }
    
    /**
     * Return cart items
     *
     * Create a new return request for the specified cart items.  This endpoint automatically changes the session state from &#x60;closed&#x60; to &#x60;partially_returned&#x60;.  Its behavior depends on whether [cart item flattening](https://docs.talon.one/docs/product/campaigns/managing-general-settings#flattening) is enabled for the Application.  **Note:** This will roll back any effects associated with these cart items. For more information, see [our documentation on session states](https://docs.talon.one/docs/dev/concepts/entities#customer-session-states) and [this tutorial](https://docs.talon.one/docs/dev/tutorials/partially-returning-a-session). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void returnCartItemsTest() throws ApiException {
        String customerSessionId = null;
        ReturnIntegrationRequest body = null;
        Boolean dry = null;
        IntegrationStateV2 response = api.returnCartItems(customerSessionId, body, dry);

        // TODO: test validations
    }
    
    /**
     * Sync cart item catalog
     *
     * Perform one or more of the following sync actions on this cart item catalog, up to 1000 actions:  - Add an item to the catalog. - Edit the attributes of an item in the catalog. - Edit the attributes of more than one item in the catalog. - Remove an item from the catalog. - Remove more than one item from the catalog.  **Note:** For more information, see [our documentation on managing cart item catalogs](https://docs.talon.one/docs/product/account/dev-tools/managing-cart-item-catalogs).  ### Filtering cart items  Use [cart item attributes](https://docs.talon.one/docs/product/account/dev-tools/managing-cart-item-catalogs#displaying-the-details-and-content-of-a-catalog) to filter items and select the ones you want to edit or delete when editing or deleting more than one item at a time.  The &#x60;filters&#x60; array contains an object with the following properties:  - &#x60;attr&#x60;: A [cart item attribute](https://docs.talon.one/docs/product/account/dev-tools/managing-attributes)   connected to the catalog. It is applied to all items in the catalog. - &#x60;op&#x60;: The filtering operator indicating the relationship between the value of each   cart item in the catalog and the value of the &#x60;value&#x60; property for the attribute selected   in &#x60;attr&#x60;.    The value of &#x60;op&#x60; can be one of the following:    - &#x60;EQ&#x60;: Equal to &#x60;value&#x60;   - &#x60;LT&#x60;: Less than &#x60;value&#x60;   - &#x60;LE&#x60;: Less than or equal to &#x60;value&#x60;   - &#x60;GT&#x60;: Greater than &#x60;value&#x60;   - &#x60;GE&#x60;: Greater than or equal to &#x60;value&#x60;   - &#x60;IN&#x60;: One of the comma-separated values that &#x60;value&#x60; is set to.    **Note:** &#x60;GE&#x60;, &#x60;LE&#x60;, &#x60;GT&#x60;, &#x60;LT&#x60; are for numeric values only.  - &#x60;value&#x60;: The value of the attribute selected in &#x60;attr&#x60;.  ### Payload examples  Synchronization actions are sent as &#x60;PUT&#x60; requests. See the structure for each action:  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Adding an item to the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;attributes\&quot;: {             \&quot;color\&quot;: \&quot;Navy blue\&quot;,             \&quot;type\&quot;: \&quot;shoe\&quot;           },           \&quot;replaceIfExists\&quot;: true,           \&quot;sku\&quot;: \&quot;SKU1241028\&quot;,           \&quot;price\&quot;: 100         },         \&quot;type\&quot;: \&quot;ADD\&quot;       }     ]   }   &#x60;&#x60;&#x60;   &lt;/div&gt; &lt;/details&gt;  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Editing the attributes of an item in the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;attributes\&quot;: {             \&quot;age\&quot;: 11,             \&quot;origin\&quot;: \&quot;germany\&quot;           },           \&quot;createIfNotExists\&quot;: false,           \&quot;sku\&quot;: \&quot;SKU1241028\&quot;         },         \&quot;type\&quot;: \&quot;PATCH\&quot;       }     ]   }   &#x60;&#x60;&#x60;   &lt;/div&gt; &lt;/details&gt;  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Editing the attributes of several items at once&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;attributes\&quot;: {             \&quot;color\&quot;: \&quot;red\&quot;           },           \&quot;filters\&quot;: [             {               \&quot;attr\&quot;: \&quot;color\&quot;,               \&quot;op\&quot;: \&quot;EQ\&quot;,               \&quot;value\&quot;: \&quot;blue\&quot;             }           ]         },         \&quot;type\&quot;: \&quot;PATCH_MANY\&quot;       }     ]   }   &#x60;&#x60;&#x60;    &lt;/div&gt; &lt;/details&gt;  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Removing an item from the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;sku\&quot;: \&quot;SKU1241028\&quot;         },         \&quot;type\&quot;: \&quot;REMOVE\&quot;       }     ]   }   &#x60;&#x60;&#x60;    &lt;/div&gt; &lt;/details&gt;  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Removing several items from the catalog at once&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;filters\&quot;: [             {               \&quot;attr\&quot;: \&quot;color\&quot;,               \&quot;op\&quot;: \&quot;EQ\&quot;,               \&quot;value\&quot;: \&quot;blue\&quot;             }           ]         },         \&quot;type\&quot;: \&quot;REMOVE_MANY\&quot;       }     ]   }   &#x60;&#x60;&#x60;   &lt;/div&gt; &lt;/details&gt;  &lt;details&gt;   &lt;summary&gt;&lt;strong&gt;Removing shoes of sizes above 45 from the catalog&lt;/strong&gt;&lt;/summary&gt;   &lt;div&gt;   &lt;p&gt;   Let&#39;s imagine that we have a shoe store and we have decided to stop selling   shoes larger than size 45. We can remove from the catalog all the shoes of sizes above 45   with a single action:&lt;/p&gt;    &#x60;&#x60;&#x60;json   {     \&quot;actions\&quot;: [       {         \&quot;payload\&quot;: {           \&quot;filters\&quot;: [             {               \&quot;attr\&quot;: \&quot;size\&quot;,               \&quot;op\&quot;: \&quot;GT\&quot;,               \&quot;value\&quot;: \&quot;45\&quot;             }           ]         },         \&quot;type\&quot;: \&quot;REMOVE_MANY\&quot;       }     ]   }   &#x60;&#x60;&#x60;   &lt;/div&gt; &lt;/details&gt; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void syncCatalogTest() throws ApiException {
        Integer catalogId = null;
        CatalogSyncRequest body = null;
        Catalog response = api.syncCatalog(catalogId, body);

        // TODO: test validations
    }
    
    /**
     * Track event
     *
     * Triggers a custom event. You can build a condition around this event in your rules.  Talon.One offers a set of [built-in events](https://docs.talon.one/docs/dev/concepts/events). Ensure you do not create a custom event when you can use a built-in event.  For example, use this endpoint to trigger an event when a customer shares a link to a product. See the [tutorial](https://docs.talon.one/docs/product/tutorials/referrals/incentivizing-product-link-sharing).  **Important:** - &#x60;profileId&#x60; is required. An event is associated with a customer profile. - Before using this endpoint, create your event as a custom attribute of type &#x60;event&#x60;. See the [Developer docs](https://docs.talon.one/docs/dev/concepts/events#creating-a-custom-event). - We recommend sending requests sequentially. See [Managing parallel requests](https://docs.talon.one/docs/dev/getting-started/integration-tutorial#managing-parallel-requests).  When you successfully sent an event to Talon.One, you can list received events in the **Events** view in the Campaign Manager. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void trackEventV2Test() throws ApiException {
        IntegrationEventV2Request body = null;
        String silent = null;
        Boolean dry = null;
        TrackEventV2Response response = api.trackEventV2(body, silent, dry);

        // TODO: test validations
    }
    
    /**
     * Update profile attributes for all customers in audience
     *
     * Update the specified profile attributes to the provided values for all customers in the specified audience. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAudienceCustomersAttributesTest() throws ApiException {
        Integer audienceId = null;
        Object body = null;
        api.updateAudienceCustomersAttributes(audienceId, body);

        // TODO: test validations
    }
    
    /**
     * Update audience name
     *
     * Update the name of the given audience created by a third-party integration. Sending a request to this endpoint does **not** trigger the rule engine.  To update the audience&#39;s members, use the [Update customer profile](#tag/Customer-profiles/operation/updateCustomerProfileV2) endpoint. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAudienceV2Test() throws ApiException {
        Integer audienceId = null;
        UpdateAudience body = null;
        Audience response = api.updateAudienceV2(audienceId, body);

        // TODO: test validations
    }
    
    /**
     * Update multiple customer profiles&#39; audiences
     *
     * Update the specified customer profiles with the specified audiences. Use this endpoint when customers join or leave audiences.  The limit of customer profiles per request is 1000. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerProfileAudiencesTest() throws ApiException {
        CustomerProfileAudienceRequest body = null;
        api.updateCustomerProfileAudiences(body);

        // TODO: test validations
    }
    
    /**
     * Update customer profile
     *
     * Update or create a [Customer Profile](https://docs.talon.one/docs/dev/concepts/entities#customer-profile). This endpoint triggers the Rule Builder.  You can use this endpoint to: - Set attributes on the given customer profile. Ensure you create the attributes in the Campaign Manager, first. - Modify the audience the customer profile is a member of.  &lt;div class&#x3D;\&quot;redoc-section\&quot;&gt;   &lt;p class&#x3D;\&quot;title\&quot;&gt;Performance tips&lt;/p&gt;    - Updating a customer profile returns a response with the requested integration state.   - You can use the &#x60;responseContent&#x60; property to save yourself extra API calls. For example, you can get     the customer profile details directly without extra requests.   - We recommend sending requests sequentially.     See [Managing parallel requests](https://docs.talon.one/docs/dev/getting-started/integration-tutorial#managing-parallel-requests). &lt;/div&gt; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerProfileV2Test() throws ApiException {
        String integrationId = null;
        CustomerProfileIntegrationRequestV2 body = null;
        Boolean runRuleEngine = null;
        Boolean dry = null;
        CustomerProfileIntegrationResponseV2 response = api.updateCustomerProfileV2(integrationId, body, runRuleEngine, dry);

        // TODO: test validations
    }
    
    /**
     * Update multiple customer profiles
     *
     * Update (or create) up to 1000 [customer profiles](https://docs.talon.one/docs/dev/concepts/entities#customer-profile) in 1 request.  The &#x60;integrationId&#x60; must be any identifier that remains stable for the customer. Do not use an ID that the customer can update themselves. For example, you can use a database ID.  A customer profile [can be linked to one or more sessions](https://docs.talon.one/integration-api#tag/Customer-sessions). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerProfilesV2Test() throws ApiException {
        MultipleCustomerProfileIntegrationRequest body = null;
        String silent = null;
        MultipleCustomerProfileIntegrationResponseV2 response = api.updateCustomerProfilesV2(body, silent);

        // TODO: test validations
    }
    
    /**
     * Update customer session
     *
     * Update or create a [customer session](https://docs.talon.one/docs/dev/concepts/entities#customer-session). The endpoint responds with the potential promotion rule [effects](https://docs.talon.one/docs/dev/integration-api/api-effects) that match the current cart. For example, use this endpoint to share the contents of a customer&#39;s cart with Talon.One.  **Note:** The currency for the session and the cart items in the session is the currency set for the Application that owns this session.  ### Session management  To use this endpoint, start by learning about [customer sessions](https://docs.talon.one/docs/dev/concepts/entities#customer-session) and their states and refer to the &#x60;state&#x60; parameter documentation the request body schema docs below.  ### Sessions and customer profiles  - To link a session to a customer profile, set the &#x60;profileId&#x60; parameter in the request body to a customer profile&#39;s &#x60;integrationId&#x60;. - While you can create an anonymous session with &#x60;profileId&#x3D;\&quot;\&quot;&#x60;, we recommend you use a guest ID instead. - A profile can be linked to simultaneous sessions in different Applications. Either:   - Use unique session integration IDs or,   - Use the same session integration ID across all of the Applications.  **Note:** If the specified profile does not exist, an empty profile is **created automatically**.   You can update it with [Update customer profile](https://docs.talon.one/integration-api#tag/Customer-profiles/operation/updateCustomerProfileV2).  &lt;div class&#x3D;\&quot;redoc-section\&quot;&gt;   &lt;p class&#x3D;\&quot;title\&quot;&gt;Performance tips&lt;/p&gt;    - Updating a customer session returns a response with the new integration state. Use the &#x60;responseContent&#x60; property to save yourself extra API calls.     For example, you can get the customer profile details directly without extra requests.   - We recommend sending requests sequentially. See [Managing parallel requests](https://docs.talon.one/docs/dev/getting-started/integration-tutorial#managing-parallel-requests). &lt;/div&gt;  For more information, see: - The introductory video in [Getting started](https://docs.talon.one/docs/dev/getting-started/overview). - The [integration tutorial](https://docs.talon.one/docs/dev/tutorials/integrating-talon-one). 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerSessionV2Test() throws ApiException {
        String customerSessionId = null;
        IntegrationRequest body = null;
        Boolean dry = null;
        IntegrationStateV2 response = api.updateCustomerSessionV2(customerSessionId, body, dry);

        // TODO: test validations
    }
    
}
