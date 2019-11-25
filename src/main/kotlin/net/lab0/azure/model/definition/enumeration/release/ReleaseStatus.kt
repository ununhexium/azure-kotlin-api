package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

/**
 * Gets status.
 */
enum class ReleaseStatus {
  @Json(name = "undefined")
  UNDEFINED,

  @Json(name = "draft")
  DRAFT,

  @Json(name = "active")
  ACTIVE,

  @Json(name = "abandoned")
  ABANDONED
}
