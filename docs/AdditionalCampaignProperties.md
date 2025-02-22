

# AdditionalCampaignProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**couponRedemptionCount** | **Integer** | Number of coupons redeemed in the campaign. |  [optional]
**referralRedemptionCount** | **Integer** | Number of referral codes redeemed in the campaign. |  [optional]
**discountCount** | [**BigDecimal**](BigDecimal.md) | Total amount of discounts redeemed in the campaign. |  [optional]
**discountEffectCount** | **Integer** | Total number of times discounts were redeemed in this campaign. |  [optional]
**couponCreationCount** | **Integer** | Total number of coupons created by rules in this campaign. |  [optional]
**customEffectCount** | **Integer** | Total number of custom effects triggered by rules in this campaign. |  [optional]
**referralCreationCount** | **Integer** | Total number of referrals created by rules in this campaign. |  [optional]
**addFreeItemEffectCount** | **Integer** | Total number of times the [add free item effect](https://docs.talon.one/docs/dev/integration-api/api-effects#addfreeitem) can be triggered in this campaign. |  [optional]
**awardedGiveawaysCount** | **Integer** | Total number of giveaways awarded by rules in this campaign. |  [optional]
**createdLoyaltyPointsCount** | [**BigDecimal**](BigDecimal.md) | Total number of loyalty points created by rules in this campaign. |  [optional]
**createdLoyaltyPointsEffectCount** | **Integer** | Total number of loyalty point creation effects triggered by rules in this campaign. |  [optional]
**redeemedLoyaltyPointsCount** | [**BigDecimal**](BigDecimal.md) | Total number of loyalty points redeemed by rules in this campaign. |  [optional]
**redeemedLoyaltyPointsEffectCount** | **Integer** | Total number of loyalty point redemption effects triggered by rules in this campaign. |  [optional]
**callApiEffectCount** | **Integer** | Total number of webhooks triggered by rules in this campaign. |  [optional]
**reservecouponEffectCount** | **Integer** | Total number of reserve coupon effects triggered by rules in this campaign. |  [optional]
**lastActivity** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent event received by this campaign. |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) | Timestamp of the most recent update to the campaign&#39;s property. Updates to external entities used in this campaign are **not** registered by this property, such as collection or coupon updates.  |  [optional]
**createdBy** | **String** | Name of the user who created this campaign if available. |  [optional]
**updatedBy** | **String** | Name of the user who last updated this campaign if available. |  [optional]
**templateId** | **Integer** | The ID of the Campaign Template this Campaign was created from. |  [optional]



