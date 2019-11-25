package net.lab0.azure.model.definition.enumeration.git

import com.squareup.moshi.Json

enum class GitResolutionStatus {
  @Json(name = "unresolved")
  UNRESOLVED,

  @Json(name = "partiallyResolved")
  PARTIALLY_RESOLVED,

  @Json(name = "resolved")
  RESOLVED
}
