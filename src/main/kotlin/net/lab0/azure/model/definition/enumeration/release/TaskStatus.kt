package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

enum class TaskStatus {
  @Json(name = "unknown")
  UNKNOWN,

  @Json(name = "pending")
  PENDING,

  @Json(name = "inProgress")
  IN_PROGRESS,

  @Json(name = "success")
  SUCCESS,

  @Json(name = "failure")
  FAILURE,

  @Json(name = "canceled")
  CANCELED,

  @Json(name = "skipped")
  SKIPPED,

  @Json(name = "succeeded")
  SUCCEEDED,

  @Json(name = "failed")
  FAILED,

  @Json(name = "partiallySucceeded")
  PARTIALLY_SUCCEEDED
}
