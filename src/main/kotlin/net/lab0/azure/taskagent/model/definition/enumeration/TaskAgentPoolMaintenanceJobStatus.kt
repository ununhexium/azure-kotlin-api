package net.lab0.azure.taskagent.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Status of the maintenance job
 */
enum class TaskAgentPoolMaintenanceJobStatus {
  @Json(name = "inProgress")
  IN_PROGRESS,

  @Json(name = "completed")
  COMPLETED,

  @Json(name = "cancelling")
  CANCELLING,

  @Json(name = "queued")
  QUEUED
}
