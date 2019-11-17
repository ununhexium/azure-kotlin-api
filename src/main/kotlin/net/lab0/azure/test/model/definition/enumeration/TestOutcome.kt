package net.lab0.azure.test.model.definition.enumeration

import com.squareup.moshi.Json

enum class TestOutcome {
  /**
   * Only used during an update to preserve the existing value.
   */
  @Json(name = "unspecified")
  UNSPECIFIED,

  /**
   * Test has not been completed, or the test type does not report pass/failure.
   */
  @Json(name = "none")
  NONE,

  /**
   * Test was executed w/o any issues.
   */
  @Json(name = "passed")
  PASSED,

  /**
   * Test was executed, but there were issues. Issues may involve exceptions or failed assertions.
   */
  @Json(name = "failed")
  FAILED,

  /**
   * Test has completed, but we can't say if it passed or failed. May be used for aborted tests...
   */
  @Json(name = "inconclusive")
  INCONCLUSIVE,

  /**
   * The test timed out
   */
  @Json(name = "timeout")
  TIMEOUT,

  /**
   * Test was aborted. This was not caused by a user gesture, but rather by a framework decision.
   */
  @Json(name = "aborted")
  ABORTED,

  /**
   * Test had it chance for been executed but was not, as ITestElement.IsRunnable == false.
   */
  @Json(name = "blocked")
  BLOCKED,

  /**
   * Test was not executed. This was caused by a user gesture - e.g. user hit stop button.
   */
  @Json(name = "notExecuted")
  NOT_EXECUTED,

  /**
   * To be used by Run level results. This is not a failure.
   */
  @Json(name = "warning")
  WARNING,

  /**
   * There was a system error while we were trying to execute a test.
   */
  @Json(name = "error")
  ERROR,

  /**
   * Test is Not Applicable for execution.
   */
  @Json(name = "notApplicable")
  NOT_APPLICABLE,

  /**
   * Test is paused.
   */
  @Json(name = "paused")
  PAUSED,

  /**
   * Test is currently executing. Added this for TCM charts
   */
  @Json(name = "inProgress")
  IN_PROGRESS,

  /**
   * Test is not impacted. Added fot TIA.
   */
  @Json(name = "notImpacted")
  NOT_IMPACTED,

  @Json(name = "maxValue")
  MAX_VALUE
}
