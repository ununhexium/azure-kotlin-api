package net.lab0.azure.taskagent.model.definition.enumeration

import com.squareup.moshi.Json

enum class PlanGroupStatus {
  @Json(name = "running")
  RUNNING,

  @Json(name = "queued")
  QUEUED,

  @Json(name = "all")
  ALL
}
