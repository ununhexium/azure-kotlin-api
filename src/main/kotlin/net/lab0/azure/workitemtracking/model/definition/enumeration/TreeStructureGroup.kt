package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

enum class TreeStructureGroup {
  @Json(name = "areas")
  AREAS,

  @Json(name = "iterations")
  ITERATIONS
}
