package net.lab0.azure.model.definition.enumeration.profile

import com.squareup.moshi.Json

enum class AvatarSize {
  @Json(name = "small")
  SMALL,

  @Json(name = "medium")
  MEDIUM,

  @Json(name = "large")
  LARGE
}
