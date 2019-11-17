package net.lab0.azure.workitemtrackingprocesstemplate.model.definition.enumeration

import com.squareup.moshi.Json

enum class ValidationIssueType {
  @Json(name = "warning")
  WARNING,

  @Json(name = "error")
  ERROR
}
