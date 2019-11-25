package net.lab0.azure.model.definition.enumeration.taskagent

import com.squareup.moshi.Json

enum class IssueType {
  @Json(name = "error")
  ERROR,

  @Json(name = "warning")
  WARNING
}
