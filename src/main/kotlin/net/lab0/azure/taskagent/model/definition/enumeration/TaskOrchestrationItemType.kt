package net.lab0.azure.taskagent.model.definition.enumeration

import com.squareup.moshi.Json

enum class TaskOrchestrationItemType {
  @Json(name = "container")
  CONTAINER,

  @Json(name = "job")
  JOB
}
