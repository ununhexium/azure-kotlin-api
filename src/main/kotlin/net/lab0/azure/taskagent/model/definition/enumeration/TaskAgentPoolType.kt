package net.lab0.azure.taskagent.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Gets or sets the type of the pool
 */
enum class TaskAgentPoolType {
  @Json(name = "automation")
  AUTOMATION,

  @Json(name = "deployment")
  DEPLOYMENT
}
