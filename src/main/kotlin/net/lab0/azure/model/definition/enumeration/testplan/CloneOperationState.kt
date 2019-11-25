package net.lab0.azure.model.definition.enumeration.testplan

import com.squareup.moshi.Json

/**
 * Clone operation state
 */
enum class CloneOperationState {
  /**
   * value for Failed State
   */
  @Json(name = "failed")
  FAILED,

  /**
   * value for Inprogress state
   */
  @Json(name = "inProgress")
  IN_PROGRESS,

  /**
   * Value for Queued State
   */
  @Json(name = "queued")
  QUEUED,

  /**
   * value for Success state
   */
  @Json(name = "succeeded")
  SUCCEEDED
}
