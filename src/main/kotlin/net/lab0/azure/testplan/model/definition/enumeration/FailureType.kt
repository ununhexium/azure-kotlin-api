package net.lab0.azure.testplan.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Failure Type for the Test Point
 */
enum class FailureType {
  @Json(name = "none")
  NONE,

  @Json(name = "regression")
  REGRESSION,

  @Json(name = "newIssue")
  NEW_ISSUE,

  @Json(name = "knownIssue")
  KNOWN_ISSUE,

  @Json(name = "unknown")
  UNKNOWN,

  @Json(name = "nullValue")
  NULL_VALUE,

  @Json(name = "maxValue")
  MAX_VALUE
}
