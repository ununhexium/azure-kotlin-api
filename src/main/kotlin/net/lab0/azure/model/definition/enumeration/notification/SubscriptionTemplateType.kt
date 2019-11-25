package net.lab0.azure.model.definition.enumeration.notification

import com.squareup.moshi.Json

enum class SubscriptionTemplateType {
  @Json(name = "user")
  USER,

  @Json(name = "team")
  TEAM,

  @Json(name = "both")
  BOTH,

  @Json(name = "none")
  NONE
}
