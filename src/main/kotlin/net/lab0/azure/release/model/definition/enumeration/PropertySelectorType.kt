package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

enum class PropertySelectorType {
  @Json(name = "inclusion")
  INCLUSION,

  @Json(name = "exclusion")
  EXCLUSION
}
