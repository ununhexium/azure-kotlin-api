package net.lab0.azure.model.definition.enumeration.taskagent

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
