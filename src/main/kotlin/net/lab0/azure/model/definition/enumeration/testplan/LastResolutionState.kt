package net.lab0.azure.model.definition.enumeration.testplan

import com.squareup.moshi.Json

/**
 * Last Resolution State Id for the TEst Point
 */
enum class LastResolutionState {
  @Json(name = "none")
  NONE,

  @Json(name = "needsInvestigation")
  NEEDS_INVESTIGATION,

  @Json(name = "testIssue")
  TEST_ISSUE,

  @Json(name = "productIssue")
  PRODUCT_ISSUE,

  @Json(name = "configurationIssue")
  CONFIGURATION_ISSUE,

  @Json(name = "nullValue")
  NULL_VALUE,

  @Json(name = "maxValue")
  MAX_VALUE
}
