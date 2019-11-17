package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Gets environment status.
 */
enum class EnvironmentStatus {
  @Json(name = "undefined")
  UNDEFINED,

  @Json(name = "notStarted")
  NOT_STARTED,

  @Json(name = "inProgress")
  IN_PROGRESS,

  @Json(name = "succeeded")
  SUCCEEDED,

  @Json(name = "canceled")
  CANCELED,

  @Json(name = "rejected")
  REJECTED,

  @Json(name = "queued")
  QUEUED,

  @Json(name = "scheduled")
  SCHEDULED,

  @Json(name = "partiallySucceeded")
  PARTIALLY_SUCCEEDED
}
