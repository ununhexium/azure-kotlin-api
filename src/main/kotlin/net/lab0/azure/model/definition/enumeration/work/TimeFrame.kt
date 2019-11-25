package net.lab0.azure.model.definition.enumeration.work

import com.squareup.moshi.Json

enum class TimeFrame {
  @Json(name = "past")
  PAST,

  @Json(name = "current")
  CURRENT,

  @Json(name = "future")
  FUTURE
}
