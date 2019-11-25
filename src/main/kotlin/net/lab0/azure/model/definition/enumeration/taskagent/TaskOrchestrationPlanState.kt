package net.lab0.azure.model.definition.enumeration.taskagent

import com.squareup.moshi.Json

enum class TaskOrchestrationPlanState {
  @Json(name = "inProgress")
  IN_PROGRESS,

  @Json(name = "queued")
  QUEUED,

  @Json(name = "completed")
  COMPLETED
}
