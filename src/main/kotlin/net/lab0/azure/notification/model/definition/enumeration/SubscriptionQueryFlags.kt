package net.lab0.azure.notification.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Flags the refine the types of subscriptions that will be returned from the query.
 */
enum class SubscriptionQueryFlags {
  @Json(name = "none")
  NONE,

  /**
   * Include subscriptions with invalid subscribers.
   */
  @Json(name = "includeInvalidSubscriptions")
  INCLUDE_INVALID_SUBSCRIPTIONS,

  /**
   * Include subscriptions marked for deletion.
   */
  @Json(name = "includeDeletedSubscriptions")
  INCLUDE_DELETED_SUBSCRIPTIONS,

  /**
   * Include the full filter details with each subscription.
   */
  @Json(name = "includeFilterDetails")
  INCLUDE_FILTER_DETAILS,

  /**
   * For a subscription the caller does not have permission to view, return basic (non-confidential)
   * information.
   */
  @Json(name = "alwaysReturnBasicInformation")
  ALWAYS_RETURN_BASIC_INFORMATION,

  /**
   * Include system subscriptions.
   */
  @Json(name = "includeSystemSubscriptions")
  INCLUDE_SYSTEM_SUBSCRIPTIONS
}
