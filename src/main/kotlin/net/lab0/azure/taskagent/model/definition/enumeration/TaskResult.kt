package net.lab0.azure.taskagent.model.definition.enumeration

import com.squareup.moshi.Json

enum class TaskResult {
  @Json(name = "succeeded")
  SUCCEEDED,

  @Json(name = "succeededWithIssues")
  SUCCEEDED_WITH_ISSUES,

  @Json(name = "failed")
  FAILED,

  @Json(name = "canceled")
  CANCELED,

  @Json(name = "skipped")
  SKIPPED,

  @Json(name = "abandoned")
  ABANDONED
}
