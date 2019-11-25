package net.lab0.azure.model.definition.enumeration.git

import com.squareup.moshi.Json

enum class GitAsyncOperationStatus {
  /**
   * The operation is waiting in a queue and has not yet started.
   */
  @Json(name = "queued")
  QUEUED,

  /**
   * The operation is currently in progress.
   */
  @Json(name = "inProgress")
  IN_PROGRESS,

  /**
   * The operation has completed.
   */
  @Json(name = "completed")
  COMPLETED,

  /**
   * The operation has failed. Check for an error message.
   */
  @Json(name = "failed")
  FAILED,

  /**
   * The operation has been abandoned.
   */
  @Json(name = "abandoned")
  ABANDONED
}
