package net.lab0.azure.graph.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The type of this scope. Typically ServiceHost or TeamProject.
 */
enum class GroupScopeType {
  @Json(name = "generic")
  GENERIC,

  @Json(name = "serviceHost")
  SERVICE_HOST,

  @Json(name = "teamProject")
  TEAM_PROJECT
}
