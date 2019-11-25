package net.lab0.azure.model.definition.enumeration.taskagent

import com.squareup.moshi.Json

enum class PlanGroupStatus {
  @Json(name = "running")
  RUNNING,

  @Json(name = "queued")
  QUEUED,

  @Json(name = "all")
  ALL
}
