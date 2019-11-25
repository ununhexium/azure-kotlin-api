package net.lab0.azure.model.definition.enumeration.workitemtrackingprocesstemplate

import com.squareup.moshi.Json

enum class ValidationIssueType {
  @Json(name = "warning")
  WARNING,

  @Json(name = "error")
  ERROR
}
