package net.lab0.azure.taskagent.model.definition.enumeration

import com.squareup.moshi.Json

enum class TaskAgentUpdateReasonType {
  @Json(name = "manual")
  MANUAL,

  @Json(name = "minAgentVersionRequired")
  MIN_AGENT_VERSION_REQUIRED
}
