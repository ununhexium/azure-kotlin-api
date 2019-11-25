package net.lab0.azure.model.definition.enumeration.cloudloadtest

import com.squareup.moshi.Json

enum class TestRunState {
  @Json(name = "pending")
  PENDING,

  @Json(name = "queued")
  QUEUED,

  @Json(name = "inProgress")
  IN_PROGRESS,

  @Json(name = "stopping")
  STOPPING,

  @Json(name = "completed")
  COMPLETED,

  @Json(name = "aborted")
  ABORTED,

  @Json(name = "error")
  ERROR
}
