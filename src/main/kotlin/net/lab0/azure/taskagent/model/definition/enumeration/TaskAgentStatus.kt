package net.lab0.azure.taskagent.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Gets the current connectivity status of the agent.
 */
enum class TaskAgentStatus {
  @Json(name = "offline")
  OFFLINE,

  @Json(name = "online")
  ONLINE
}
