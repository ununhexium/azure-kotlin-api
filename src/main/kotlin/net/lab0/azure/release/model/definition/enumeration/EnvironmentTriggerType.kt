package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

enum class EnvironmentTriggerType {
  @Json(name = "undefined")
  UNDEFINED,

  @Json(name = "deploymentGroupRedeploy")
  DEPLOYMENT_GROUP_REDEPLOY,

  @Json(name = "rollbackRedeploy")
  ROLLBACK_REDEPLOY
}
