package net.lab0.azure.git.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * State of the status.
 */
enum class GitStatusState {
  /**
   * Status state not set. Default state.
   */
  @Json(name = "notSet")
  NOT_SET,

  /**
   * Status pending.
   */
  @Json(name = "pending")
  PENDING,

  /**
   * Status succeeded.
   */
  @Json(name = "succeeded")
  SUCCEEDED,

  /**
   * Status failed.
   */
  @Json(name = "failed")
  FAILED,

  /**
   * Status with an error.
   */
  @Json(name = "error")
  ERROR,

  /**
   * Status is not applicable to the target object.
   */
  @Json(name = "notApplicable")
  NOT_APPLICABLE
}
