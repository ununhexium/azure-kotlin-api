package net.lab0.azure.model.definition.enumeration.testplan

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
