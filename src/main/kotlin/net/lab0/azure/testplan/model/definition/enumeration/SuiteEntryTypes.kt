package net.lab0.azure.testplan.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Defines whther the entry is of type test case or suite.
 */
enum class SuiteEntryTypes {
  /**
   * Test Case
   */
  @Json(name = "testCase")
  TEST_CASE,

  /**
   * Child Suite
   */
  @Json(name = "suite")
  SUITE
}
