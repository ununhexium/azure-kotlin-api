package net.lab0.azure.notification.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The permissions the user have for this subscriptions.
 */
enum class SubscriptionPermissions {
  /**
   * None
   */
  @Json(name = "none")
  NONE,

  /**
   * full view of description, filters, etc. Not limited.
   */
  @Json(name = "view")
  VIEW,

  /**
   * update subscription
   */
  @Json(name = "edit")
  EDIT,

  /**
   * delete subscription
   */
  @Json(name = "delete")
  DELETE
}
