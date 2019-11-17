package net.lab0.azure.taskagent.model.definition.enumeration

import com.squareup.moshi.Json

enum class TimelineRecordState {
  @Json(name = "pending")
  PENDING,

  @Json(name = "inProgress")
  IN_PROGRESS,

  @Json(name = "completed")
  COMPLETED
}
