package net.lab0.azure.core.model.definition.enumeration

import com.squareup.moshi.Json

enum class ProjectChangeType {
  @Json(name = "modified")
  MODIFIED,

  @Json(name = "deleted")
  DELETED,

  @Json(name = "added")
  ADDED
}
