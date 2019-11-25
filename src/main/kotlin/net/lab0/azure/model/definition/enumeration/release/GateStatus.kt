package net.lab0.azure.model.definition.enumeration.release

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
