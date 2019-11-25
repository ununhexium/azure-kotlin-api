package net.lab0.azure.model.definition.enumeration.core

import com.squareup.moshi.Json

enum class ProjectChangeType {
  @Json(name = "modified")
  MODIFIED,

  @Json(name = "deleted")
  DELETED,

  @Json(name = "added")
  ADDED
}
