package net.lab0.azure.notification.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The default group delivery preference for groups in this collection
 */
enum class DefaultGroupDeliveryPreference {
  @Json(name = "noDelivery")
  NO_DELIVERY,

  @Json(name = "eachMember")
  EACH_MEMBER
}
