package net.lab0.azure.notification.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Indicates how the subscriber should be notified by default.
 */
enum class NotificationSubscriberDeliveryPreference {
  @Json(name = "noDelivery")
  NO_DELIVERY,

  /**
   * Deliver notifications to the subscriber's preferred email address.
   */
  @Json(name = "preferredEmailAddress")
  PREFERRED_EMAIL_ADDRESS,

  @Json(name = "eachMember")
  EACH_MEMBER,

  @Json(name = "useDefault")
  USE_DEFAULT
}
