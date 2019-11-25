package net.lab0.azure.model.definition.enumeration.test

import com.squareup.moshi.Json

enum class TestRunOutcome {
  /**
   * Run with zero failed tests and has atleast one impacted test
   */
  @Json(name = "passed")
  PASSED,

  /**
   * Run with at-least one failed test.
   */
  @Json(name = "failed")
  FAILED,

  /**
   * Run with no impacted tests.
   */
  @Json(name = "notImpacted")
  NOT_IMPACTED,

  /**
   * Runs with All tests in other category.
   */
  @Json(name = "others")
  OTHERS
}
