package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

enum class GetWorkItemTypeExpand {
  @Json(name = "none")
  NONE,

  @Json(name = "states")
  STATES,

  @Json(name = "behaviors")
  BEHAVIORS,

  @Json(name = "layout")
  LAYOUT
}
