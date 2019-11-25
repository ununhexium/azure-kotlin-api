package net.lab0.azure.model.definition.enumeration.workitemtracking

import com.squareup.moshi.Json

enum class TreeStructureGroup {
  @Json(name = "areas")
  AREAS,

  @Json(name = "iterations")
  ITERATIONS
}
