package net.lab0.azure.taskagent.model.definition.enumeration

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
