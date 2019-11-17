package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

enum class ReleaseTriggerType {
  @Json(name = "undefined")
  UNDEFINED,

  @Json(name = "artifactSource")
  ARTIFACT_SOURCE,

  @Json(name = "schedule")
  SCHEDULE,

  @Json(name = "sourceRepo")
  SOURCE_REPO,

  @Json(name = "containerImage")
  CONTAINER_IMAGE,

  @Json(name = "package")
  PACKAGE,

  @Json(name = "pullRequest")
  PULL_REQUEST
}
