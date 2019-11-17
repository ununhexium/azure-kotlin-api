package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

enum class GetProcessExpandLevel {
  @Json(name = "none")
  NONE,

  @Json(name = "projects")
  PROJECTS
}
