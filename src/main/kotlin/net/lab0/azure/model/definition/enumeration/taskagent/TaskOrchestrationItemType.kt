package net.lab0.azure.model.definition.enumeration.taskagent

import com.squareup.moshi.Json

enum class TaskOrchestrationItemType {
  @Json(name = "container")
  CONTAINER,

  @Json(name = "job")
  JOB
}
