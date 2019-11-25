package net.lab0.azure.model.definition.enumeration.taskagent

import com.squareup.moshi.Json

enum class DeploymentTargetExpands {
  /**
   * No additional properties.
   */
  @Json(name = "none")
  NONE,

  /**
   * Include capabilities of the deployment agent.
   */
  @Json(name = "capabilities")
  CAPABILITIES,

  /**
   * Include the job request assigned to the deployment agent.
   */
  @Json(name = "assignedRequest")
  ASSIGNED_REQUEST,

  /**
   * Include the last completed job request of the deployment agent.
   */
  @Json(name = "lastCompletedRequest")
  LAST_COMPLETED_REQUEST
}
