package net.lab0.azure.model.definition.enumeration.test

import com.squareup.moshi.Json

enum class TestRunState {
  /**
   * Only used during an update to preserve the existing value.
   */
  @Json(name = "unspecified")
  UNSPECIFIED,

  /**
   * The run is still being created.  No tests have started yet.
   */
  @Json(name = "notStarted")
  NOT_STARTED,

  /**
   * Tests are running.
   */
  @Json(name = "inProgress")
  IN_PROGRESS,

  /**
   * All tests have completed or been skipped.
   */
  @Json(name = "completed")
  COMPLETED,

  /**
   * Run is stopped and remaing tests have been aborted
   */
  @Json(name = "aborted")
  ABORTED,

  /**
   * Run is currently initializing This is a legacy state and should not be used any more
   */
  @Json(name = "waiting")
  WAITING,

  /**
   * Run requires investigation because of a test point failure This is a legacy state and should
   * not be used any more
   */
  @Json(name = "needsInvestigation")
  NEEDS_INVESTIGATION
}
