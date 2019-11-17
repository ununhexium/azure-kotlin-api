package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Gets or sets the type of approval.
 */
enum class ApprovalType {
  @Json(name = "undefined")
  UNDEFINED,

  @Json(name = "preDeploy")
  PRE_DEPLOY,

  @Json(name = "postDeploy")
  POST_DEPLOY,

  @Json(name = "all")
  ALL
}
