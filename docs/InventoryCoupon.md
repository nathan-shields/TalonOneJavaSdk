

# InventoryCoupon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**campaignId** | **Integer** | The ID of the campaign that owns this entity. | 
**value** | **String** | The coupon code. | 
**usageLimit** | **Integer** | The number of times the coupon code can be redeemed. &#x60;0&#x60; means unlimited redemptions but any campaign usage limits will still apply.  | 
**discountLimit** | [**BigDecimal**](BigDecimal.md) | The total discount value that the code can give. Typically used to represent a gift card value.  |  [optional]
**reservationLimit** | **Integer** | The number of reservations that can be made with this coupon code.  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp at which point the coupon becomes valid. |  [optional]
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiration date of the coupon. Coupon never expires if this is omitted, zero, or negative. |  [optional]
**limits** | [**List&lt;LimitConfig&gt;**](LimitConfig.md) | Limits configuration for a coupon. These limits will override the limits set from the campaign.  **Note:** Only usable when creating a single coupon which is not tied to a specific recipient. Only per-profile limits are allowed to be configured.  |  [optional]
**usageCounter** | **Integer** | The number of times the coupon has been successfully redeemed. | 
**discountCounter** | [**BigDecimal**](BigDecimal.md) | The amount of discounts given on rules redeeming this coupon. Only usable if a coupon discount budget was set for this coupon. |  [optional]
**discountRemainder** | [**BigDecimal**](BigDecimal.md) | The remaining discount this coupon can give. |  [optional]
**reservationCounter** | [**BigDecimal**](BigDecimal.md) | The number of times this coupon has been reserved. |  [optional]
**attributes** | [**Object**](.md) | Custom attributes associated with this coupon. |  [optional]
**referralId** | **Integer** | The integration ID of the referring customer (if any) for whom this coupon was created as an effect. |  [optional]
**recipientIntegrationId** | **String** | The Integration ID of the customer that is allowed to redeem this coupon. |  [optional]
**importId** | **Integer** | The ID of the Import which created this coupon. |  [optional]
**reservation** | **Boolean** | Defines the type of reservation: - &#x60;true&#x60;: The reservation is a soft reservation. Any customer can use the coupon. This is done via the [Create coupon reservation](https://docs.talon.one/integration-api#operation/createCouponReservation) endpoint. - &#x60;false&#x60;: The reservation is a hard reservation. Only the associated customer (&#x60;recipientIntegrationId&#x60;) can use the coupon. This is done via the Campaign Manager when you create a coupon for a given &#x60;recipientIntegrationId&#x60;, the [Create coupons](https://docs.talon.one/management-api#operation/createCoupons) endpoint or [Create coupons for multiple recipients](https://docs.talon.one/management-api#operation/createCouponsForMultipleRecipients) endpoint.  |  [optional]
**batchId** | **String** | The id of the batch the coupon belongs to. |  [optional]
**isReservationMandatory** | **Boolean** | Whether the reservation effect actually created a new reservation. |  [optional]
**implicitlyReserved** | **Boolean** | An indication of whether the coupon is implicitly reserved for all customers. |  [optional]
**profileRedemptionCount** | **Integer** | The number of times the coupon was redeemed by the profile. | 
**state** | **String** | Can be:  - &#x60;active&#x60;: The coupon can be used. It is a reserved coupon that is neither pending, used nor expired, and has a non-exhausted limit counter. - &#x60;used&#x60;: The coupon has been redeemed and cannot be used again. It is not pending and has reached its redemption limit or was redeemed by the profile before expiration. - &#x60;expired&#x60;: The coupon was never redeemed and it is now expired. It is non-pending, non-active and non-used by the profile. - &#x60;pending&#x60;: The coupon will be usable in the future. - &#x60;disabled&#x60;: The coupon is part of a non-active campaign.  | 



