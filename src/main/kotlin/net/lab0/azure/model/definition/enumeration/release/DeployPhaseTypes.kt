package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

enum class DeployPhaseTypes {
  @Json(name = "undefined")
  UNDEFINED,

  @Json(name = "agentBasedDeployment")
  AGENT_BASED_DEPLOYMENT,

  @Json(name = "runOnServer")
  RUN_ON_SERVER,

  @Json(name = "machineGroupBasedDeployment")
  MACHINE_GROUP_BASED_DEPLOYMENT,

  /**
   * Phase type which contains tasks which acts as Gates for the deployment to go forward.
   */
  @Json(name = "deploymentGates")
  DEPLOYMENT_GATES
}
