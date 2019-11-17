package net.lab0.azure.profile.model.definition.enumeration

import com.squareup.moshi.Json

enum class AvatarSize {
  @Json(name = "small")
  SMALL,

  @Json(name = "medium")
  MEDIUM,

  @Json(name = "large")
  LARGE
}
