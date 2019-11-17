package net.lab0.azure.core.model.definition.enumeration

import com.squareup.moshi.Json

enum class ProcessType {
  @Json(name = "system")
  SYSTEM,

  @Json(name = "custom")
  CUSTOM,

  @Json(name = "inherited")
  INHERITED
}
