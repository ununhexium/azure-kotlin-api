package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

enum class ReleaseDefinitionExpands {
  @Json(name = "none")
  NONE,

  @Json(name = "environments")
  ENVIRONMENTS,

  @Json(name = "artifacts")
  ARTIFACTS,

  @Json(name = "triggers")
  TRIGGERS,

  @Json(name = "variables")
  VARIABLES,

  @Json(name = "tags")
  TAGS,

  @Json(name = "lastRelease")
  LAST_RELEASE
}
