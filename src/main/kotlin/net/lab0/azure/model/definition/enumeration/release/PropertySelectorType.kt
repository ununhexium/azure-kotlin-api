package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

enum class PropertySelectorType {
  @Json(name = "inclusion")
  INCLUSION,

  @Json(name = "exclusion")
  EXCLUSION
}
