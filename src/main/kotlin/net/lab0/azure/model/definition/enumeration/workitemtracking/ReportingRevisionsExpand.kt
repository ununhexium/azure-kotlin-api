package net.lab0.azure.model.definition.enumeration.workitemtracking

import com.squareup.moshi.Json

enum class ReportingRevisionsExpand {
  @Json(name = "none")
  NONE,

  @Json(name = "fields")
  FIELDS
}
