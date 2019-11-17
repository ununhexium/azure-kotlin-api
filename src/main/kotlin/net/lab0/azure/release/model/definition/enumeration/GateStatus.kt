package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

enum class GateStatus {
  @Json(name = "none")
  NONE,

  @Json(name = "pending")
  PENDING,

  @Json(name = "inProgress")
  IN_PROGRESS,

  @Json(name = "succeeded")
  SUCCEEDED,

  @Json(name = "failed")
  FAILED,

  @Json(name = "canceled")
  CANCELED
}
