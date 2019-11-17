package net.lab0.azure.release.model.definition.enumeration

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
