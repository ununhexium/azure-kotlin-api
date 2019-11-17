package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Type of the activity
 */
enum class WorkItemRecentActivityType {
  @Json(name = "visited")
  VISITED,

  @Json(name = "edited")
  EDITED,

  @Json(name = "deleted")
  DELETED,

  @Json(name = "restored")
  RESTORED
}
