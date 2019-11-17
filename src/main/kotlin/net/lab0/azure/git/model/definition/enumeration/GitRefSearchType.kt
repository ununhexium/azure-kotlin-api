package net.lab0.azure.git.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Type of search on refNames, if provided
 */
enum class GitRefSearchType {
  @Json(name = "exact")
  EXACT,

  @Json(name = "startsWith")
  STARTS_WITH,

  @Json(name = "contains")
  CONTAINS
}
