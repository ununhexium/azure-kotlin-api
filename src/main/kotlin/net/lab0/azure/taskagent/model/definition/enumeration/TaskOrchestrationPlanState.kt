package net.lab0.azure.taskagent.model.definition.enumeration

import com.squareup.moshi.Json

enum class TaskOrchestrationPlanState {
  @Json(name = "inProgress")
  IN_PROGRESS,

  @Json(name = "queued")
  QUEUED,

  @Json(name = "completed")
  COMPLETED
}
