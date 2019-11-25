package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

enum class DeploymentExpands {
  @Json(name = "all")
  ALL,

  @Json(name = "deploymentOnly")
  DEPLOYMENT_ONLY,

  @Json(name = "approvals")
  APPROVALS,

  @Json(name = "artifacts")
  ARTIFACTS
}
