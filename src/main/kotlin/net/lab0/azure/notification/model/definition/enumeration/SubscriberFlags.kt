package net.lab0.azure.notification.model.definition.enumeration

import com.squareup.moshi.Json

enum class SubscriberFlags {
  @Json(name = "none")
  NONE,

  /**
   * Subscriber's delivery preferences could be updated
   */
  @Json(name = "deliveryPreferencesEditable")
  DELIVERY_PREFERENCES_EDITABLE,

  /**
   * Subscriber's delivery preferences supports email delivery
   */
  @Json(name = "supportsPreferredEmailAddressDelivery")
  SUPPORTS_PREFERRED_EMAIL_ADDRESS_DELIVERY,

  /**
   * Subscriber's delivery preferences supports individual members delivery(group expansion)
   */
  @Json(name = "supportsEachMemberDelivery")
  SUPPORTS_EACH_MEMBER_DELIVERY,

  /**
   * Subscriber's delivery preferences supports no delivery
   */
  @Json(name = "supportsNoDelivery")
  SUPPORTS_NO_DELIVERY,

  /**
   * Subscriber is a user
   */
  @Json(name = "isUser")
  IS_USER,

  /**
   * Subscriber is a group
   */
  @Json(name = "isGroup")
  IS_GROUP,

  /**
   * Subscriber is a team
   */
  @Json(name = "isTeam")
  IS_TEAM
}
