package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

enum class WorkItemTypeClass {
  @Json(name = "system")
  SYSTEM,

  @Json(name = "derived")
  DERIVED,

  @Json(name = "custom")
  CUSTOM
}
