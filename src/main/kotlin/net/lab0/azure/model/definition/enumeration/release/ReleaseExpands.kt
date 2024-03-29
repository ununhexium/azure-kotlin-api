package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

enum class ReleaseExpands {
  @Json(name = "none")
  NONE,

  @Json(name = "environments")
  ENVIRONMENTS,

  @Json(name = "artifacts")
  ARTIFACTS,

  @Json(name = "approvals")
  APPROVALS,

  @Json(name = "manualInterventions")
  MANUAL_INTERVENTIONS,

  @Json(name = "variables")
  VARIABLES,

  @Json(name = "tags")
  TAGS
}
