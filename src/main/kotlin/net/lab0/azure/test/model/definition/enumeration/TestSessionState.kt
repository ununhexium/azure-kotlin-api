package net.lab0.azure.test.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * State of the test session
 */
enum class TestSessionState {
  /**
   * Only used during an update to preserve the existing value.
   */
  @Json(name = "unspecified")
  UNSPECIFIED,

  /**
   * The session is still being created.
   */
  @Json(name = "notStarted")
  NOT_STARTED,

  /**
   * The session is running.
   */
  @Json(name = "inProgress")
  IN_PROGRESS,

  /**
   * The session has paused.
   */
  @Json(name = "paused")
  PAUSED,

  /**
   * The session has completed.
   */
  @Json(name = "completed")
  COMPLETED,

  /**
   * This is required for Feedback session which are declined
   */
  @Json(name = "declined")
  DECLINED
}
