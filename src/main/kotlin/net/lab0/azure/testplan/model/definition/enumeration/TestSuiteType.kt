package net.lab0.azure.testplan.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Test suite type.
 */
enum class TestSuiteType {
  /**
   * Default suite type
   */
  @Json(name = "none")
  NONE,

  /**
   * Query Based test Suite
   */
  @Json(name = "dynamicTestSuite")
  DYNAMIC_TEST_SUITE,

  /**
   * Static Test Suite
   */
  @Json(name = "staticTestSuite")
  STATIC_TEST_SUITE,

  /**
   * Requirement based Test Suite
   */
  @Json(name = "requirementTestSuite")
  REQUIREMENT_TEST_SUITE
}
