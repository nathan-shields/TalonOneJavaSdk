

# LoyaltyProgram


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | The ID of loyalty program. Internal ID of this entity. | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The time this entity was created. | 
**title** | **String** | The display title for the Loyalty Program. | 
**description** | **String** | Description of our Loyalty Program. | 
**subscribedApplications** | **List&lt;Integer&gt;** | A list containing the IDs of all applications that are subscribed to this Loyalty Program. | 
**defaultValidity** | **String** | The default duration after which new loyalty points should expire. Can be &#39;unlimited&#39; or a specific time. The time format is a number followed by one letter indicating the time unit, like &#39;30s&#39;, &#39;40m&#39;, &#39;1h&#39;, &#39;5D&#39;, &#39;7W&#39;, or 10M&#39;. These rounding suffixes are also supported: - &#39;_D&#39; for rounding down. Can be used as a suffix after &#39;D&#39;, and signifies the start of the day. - &#39;_U&#39; for rounding up. Can be used as a suffix after &#39;D&#39;, &#39;W&#39;, and &#39;M&#39;, and signifies the end of the day, week, and month.  | 
**defaultPending** | **String** | The default duration of the pending time after which points should be valid. Can be &#39;immediate&#39; or a specific time. The time format is a number followed by one letter indicating the time unit, like &#39;30s&#39;, &#39;40m&#39;, &#39;1h&#39;, &#39;5D&#39;, &#39;7W&#39;, or 10M&#39;. These rounding suffixes are also supported: - &#39;_D&#39; for rounding down. Can be used as a suffix after &#39;D&#39;, and signifies the start of the day. - &#39;_U&#39; for rounding up. Can be used as a suffix after &#39;D&#39;, &#39;W&#39;, and &#39;M&#39;, and signifies the end of the day, week, and month.  | 
**allowSubledger** | **Boolean** | Indicates if this program supports subledgers inside the program. | 
**usersPerCardLimit** | **Integer** | The max amount of user profiles with whom a card can be shared. This can be set to 0 for no limit. This property is only used when &#x60;cardBased&#x60; is &#x60;true&#x60;.  |  [optional]
**sandbox** | **Boolean** | Indicates if this program is a live or sandbox program. Programs of a given type can only be connected to Applications of the same type. | 
**tiersExpireIn** | **String** | The duration is an **integer** followed by one letter indicating the time unit.  Examples: &#x60;30s&#x60;, &#x60;40m&#x60;, &#x60;1h&#x60;, &#x60;5D&#x60;, &#x60;7W&#x60;, &#x60;10M&#x60;, &#x60;15Y&#x60;.  Available units:  - &#x60;s&#x60;: seconds - &#x60;m&#x60;: minutes - &#x60;h&#x60;: hours - &#x60;D&#x60;: days - &#x60;W&#x60;: weeks - &#x60;M&#x60;: months - &#x60;Y&#x60;: years  You can round certain units up or down: - &#x60;_D&#x60; for rounding down days only. Signifies the start of the day. - &#x60;_U&#x60; for rounding up days, weeks, months and years. Signifies the end of the day, week, month or year.  |  [optional]
**tiersDowngradePolicy** | [**TiersDowngradePolicyEnum**](#TiersDowngradePolicyEnum) | Customers&#39;s tier downgrade policy.  - &#x60;one_down&#x60;: Once the tier expires and if the user doesn&#39;t have enough points to stay in the tier, the user is downgraded one tier down.  - &#x60;balance_based&#x60;: Once the tier expires, the user&#39;s tier is evaluated based on the amount of active points the user has at this instant.  |  [optional]
**accountID** | **Integer** | The ID of the Talon.One account that owns this program. | 
**name** | **String** | The internal name for the Loyalty Program. This is an immutable value. | 
**tiers** | [**List&lt;LoyaltyTier&gt;**](LoyaltyTier.md) | The tiers in this loyalty program. |  [optional]
**timezone** | **String** | A string containing an IANA timezone descriptor. | 
**cardBased** | **Boolean** | Defines the type of loyalty program: - &#x60;true&#x60;: the program is a card-based. - &#x60;false&#x60;: the program is profile-based.  | 
**canUpdateTiers** | **Boolean** | &#x60;True&#x60; if the tier definitions can be updated.  |  [optional]
**canUpgradeToAdvancedTiers** | **Boolean** | &#x60;True&#x60; if the program can be upgraded to use the &#x60;tiersExpireIn&#x60; and &#x60;tiersDowngradePolicy&#x60; properties.  |  [optional]



## Enum: TiersDowngradePolicyEnum

Name | Value
---- | -----
ONE_DOWN | &quot;one_down&quot;
BALANCE_BASED | &quot;balance_based&quot;



