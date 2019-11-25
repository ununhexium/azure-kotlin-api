package net.lab0.azure.model.definition.enumeration.test

import com.squareup.moshi.Json

/**
 * Current state of the operation. When State reaches Suceeded or Failed, the operation is complete
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
