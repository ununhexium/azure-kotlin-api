package net.lab0.azure.model.definition.enumeration.test

import com.squareup.moshi.Json

/**
 * The type of the object generated as a result of the Clone operation
 */
enum class ResultObjectType {
  /**
   * Suite Clone
   */
  @Json(name = "testSuite")
  TEST_SUITE,

  /**
   * Plan Clone
   */
  @Json(name = "testPlan")
  TEST_PLAN
}
