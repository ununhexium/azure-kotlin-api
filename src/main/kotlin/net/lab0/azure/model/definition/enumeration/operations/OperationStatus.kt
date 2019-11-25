package net.lab0.azure.model.definition.enumeration.operations

import com.squareup.moshi.Json

/**
 * The current status of the operation.
 */
enum class OperationStatus {
  /**
   * The operation does not have a status set.
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
  FAILED
}
