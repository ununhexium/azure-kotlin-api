package net.lab0.azure.notification.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Read-only indicators that further describe the subscription.
 */
enum class SubscriptionFlags {
  /**
   * None
   */
  @Json(name = "none")
  NONE,

  /**
   * Subscription's subscriber is a group, not a user
   */
  @Json(name = "groupSubscription")
  GROUP_SUBSCRIPTION,

  /**
   * Subscription is contributed and not persisted. This means certain fields of the subscription,
   * like Filter, are read-only.
   */
  @Json(name = "contributedSubscription")
  CONTRIBUTED_SUBSCRIPTION,

  /**
   * A user that is member of the subscription's subscriber group can opt in/out of the
   * subscription.
   */
  @Json(name = "canOptOut")
  CAN_OPT_OUT,

  /**
   * If the subscriber is a group, is it a team.
   */
  @Json(name = "teamSubscription")
  TEAM_SUBSCRIPTION
}
