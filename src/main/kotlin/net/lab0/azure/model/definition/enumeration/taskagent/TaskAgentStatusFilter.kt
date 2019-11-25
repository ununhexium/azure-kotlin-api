package net.lab0.azure.model.definition.enumeration.taskagent

import com.squareup.moshi.Json

enum class TaskAgentStatusFilter {
  /**
   * Only deployment targets that are offline.
   */
  @Json(name = "offline")
  OFFLINE,

  /**
   * Only deployment targets that are online.
   */
  @Json(name = "online")
  ONLINE,

  /**
   * All deployment targets.
   */
  @Json(name = "all")
  ALL
}
