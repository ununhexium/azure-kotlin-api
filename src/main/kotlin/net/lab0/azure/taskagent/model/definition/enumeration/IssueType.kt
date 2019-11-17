package net.lab0.azure.taskagent.model.definition.enumeration

import com.squareup.moshi.Json

enum class IssueType {
  @Json(name = "error")
  ERROR,

  @Json(name = "warning")
  WARNING
}
