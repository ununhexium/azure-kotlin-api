package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

enum class ReportingRevisionsExpand {
  @Json(name = "none")
  NONE,

  @Json(name = "fields")
  FIELDS
}
