package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Gets reason of release.
 */
enum class ReleaseReason {
  @Json(name = "none")
  NONE,

  @Json(name = "manual")
  MANUAL,

  @Json(name = "continuousIntegration")
  CONTINUOUS_INTEGRATION,

  @Json(name = "schedule")
  SCHEDULE,

  @Json(name = "pullRequest")
  PULL_REQUEST
}
