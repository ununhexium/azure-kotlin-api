package net.lab0.azure.model.definition.enumeration.taskagent

import com.squareup.moshi.Json

enum class TaskAgentUpdateReasonType {
  @Json(name = "manual")
  MANUAL,

  @Json(name = "minAgentVersionRequired")
  MIN_AGENT_VERSION_REQUIRED
}
