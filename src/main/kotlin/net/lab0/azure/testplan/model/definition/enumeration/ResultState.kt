package net.lab0.azure.testplan.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Last Result State of the Test Point
 */
enum class ResultState {
  /**
   * Only used during an update to preserve the existing value.
   */
  @Json(name = "unspecified")
  UNSPECIFIED,

  /**
   * Test is in the execution queue, was not started yet.
   */
  @Json(name = "pending")
  PENDING,

  /**
   * Test has been queued. This is applicable when a test case is queued for execution
   */
  @Json(name = "queued")
  QUEUED,

  /**
   * Test is currently executing.
   */
  @Json(name = "inProgress")
  IN_PROGRESS,

  /**
   * Test has been paused. This is applicable when a test case is paused by the user (For e.g.
   * Manual Tester can pause the execution of the manual test case)
   */
  @Json(name = "paused")
  PAUSED,

  /**
   * Test has completed, but there is no quantative measure of completeness. This may apply to load
   * tests.
   */
  @Json(name = "completed")
  COMPLETED,

  @Json(name = "maxValue")
  MAX_VALUE
}
