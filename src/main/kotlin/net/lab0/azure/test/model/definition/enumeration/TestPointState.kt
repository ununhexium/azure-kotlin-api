package net.lab0.azure.test.model.definition.enumeration

import com.squareup.moshi.Json

enum class TestPointState {
  /**
   * Default
   */
  @Json(name = "none")
  NONE,

  /**
   * The test point needs to be executed in order for the test pass to be considered complete. 
   * Either the test has not been run before or the previous run failed.
   */
  @Json(name = "ready")
  READY,

  /**
   * The test has passed successfully and does not need to be re-run for the test pass to be
   * considered complete.
   */
  @Json(name = "completed")
  COMPLETED,

  /**
   * The test point needs to be executed but is not able to.
   */
  @Json(name = "notReady")
  NOT_READY,

  /**
   * The test is being executed.
   */
  @Json(name = "inProgress")
  IN_PROGRESS,

  @Json(name = "maxValue")
  MAX_VALUE
}
