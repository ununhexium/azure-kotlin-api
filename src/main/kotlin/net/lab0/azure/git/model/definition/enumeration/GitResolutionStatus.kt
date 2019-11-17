package net.lab0.azure.git.model.definition.enumeration

import com.squareup.moshi.Json

enum class GitResolutionStatus {
  @Json(name = "unresolved")
  UNRESOLVED,

  @Json(name = "partiallyResolved")
  PARTIALLY_RESOLVED,

  @Json(name = "resolved")
  RESOLVED
}
