package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

enum class DeployPhaseStatus {
  @Json(name = "undefined")
  UNDEFINED,

  @Json(name = "notStarted")
  NOT_STARTED,

  @Json(name = "inProgress")
  IN_PROGRESS,

  @Json(name = "partiallySucceeded")
  PARTIALLY_SUCCEEDED,

  @Json(name = "succeeded")
  SUCCEEDED,

  @Json(name = "failed")
  FAILED,

  @Json(name = "canceled")
  CANCELED,

  @Json(name = "skipped")
  SKIPPED,

  @Json(name = "cancelling")
  CANCELLING
}
