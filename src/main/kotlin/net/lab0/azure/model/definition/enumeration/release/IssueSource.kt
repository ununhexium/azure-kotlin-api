package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

enum class IssueSource {
  @Json(name = "none")
  NONE,

  @Json(name = "user")
  USER,

  @Json(name = "system")
  SYSTEM
}
