package net.lab0.azure.notification.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Subscription evaluation job status
 */
enum class EvaluationOperationStatus {
  /**
   * The operation object does not have the status set.
   */
  @Json(name = "notSet")
  NOT_SET,

  /**
   * The operation has been queued.
   */
  @Json(name = "queued")
  QUEUED,

  /**
   * The operation is in progress.
   */
  @Json(name = "inProgress")
  IN_PROGRESS,

  /**
   * The operation was cancelled by the user.
   */
  @Json(name = "cancelled")
  CANCELLED,

  /**
   * The operation completed successfully.
   */
  @Json(name = "succeeded")
  SUCCEEDED,

  /**
   * The operation completed with a failure.
   */
  @Json(name = "failed")
  FAILED,

  /**
   * The operation timed out.
   */
  @Json(name = "timedOut")
  TIMED_OUT,

  /**
   * The operation could not be found.
   */
  @Json(name = "notFound")
  NOT_FOUND
}
