package net.lab0.azure.model.definition.enumeration.notification

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
