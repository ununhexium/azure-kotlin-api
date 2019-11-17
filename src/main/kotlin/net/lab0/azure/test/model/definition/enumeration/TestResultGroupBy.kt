package net.lab0.azure.test.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Group the result on the basis of TestResultGroupBy. This can be Branch, Environment or null(if
 * results are fetched by BuildDefinitionId)
 */
enum class TestResultGroupBy {
  /**
   * Group the results by branches
   */
  @Json(name = "branch")
  BRANCH,

  /**
   * Group the results by environment
   */
  @Json(name = "environment")
  ENVIRONMENT
}
