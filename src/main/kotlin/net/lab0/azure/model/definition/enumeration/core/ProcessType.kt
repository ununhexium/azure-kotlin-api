package net.lab0.azure.model.definition.enumeration.core

import com.squareup.moshi.Json

enum class ProcessType {
  @Json(name = "system")
  SYSTEM,

  @Json(name = "custom")
  CUSTOM,

  @Json(name = "inherited")
  INHERITED
}
