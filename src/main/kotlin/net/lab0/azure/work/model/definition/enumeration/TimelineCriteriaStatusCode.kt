package net.lab0.azure.work.model.definition.enumeration

import com.squareup.moshi.Json

enum class TimelineCriteriaStatusCode {
  /**
   * No error - filter is good.
   */
  @Json(name = "oK")
  O_K,

  /**
   * One of the filter clause is invalid.
   */
  @Json(name = "invalidFilterClause")
  INVALID_FILTER_CLAUSE,

  /**
   * Unknown error.
   */
  @Json(name = "unknown")
  UNKNOWN
}
