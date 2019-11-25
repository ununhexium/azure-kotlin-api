package net.lab0.azure.model.definition.enumeration.taskagent

import com.squareup.moshi.Json

enum class TimelineRecordState {
  @Json(name = "pending")
  PENDING,

  @Json(name = "inProgress")
  IN_PROGRESS,

  @Json(name = "completed")
  COMPLETED
}
