package net.lab0.azure.work.model.definition.enumeration

import com.squareup.moshi.Json

enum class TimeFrame {
  @Json(name = "past")
  PAST,

  @Json(name = "current")
  CURRENT,

  @Json(name = "future")
  FUTURE
}
