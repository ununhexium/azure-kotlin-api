package net.lab0.azure.taskagent.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The maintenance job result
 */
enum class TaskAgentPoolMaintenanceJobResult {
  @Json(name = "succeeded")
  SUCCEEDED,

  @Json(name = "failed")
  FAILED,

  @Json(name = "canceled")
  CANCELED
}
