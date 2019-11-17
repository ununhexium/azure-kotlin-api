package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Gets status of the deployment.
 */
enum class DeploymentStatus {
  /**
   * The deployment status is undefined.
   */
  @Json(name = "undefined")
  UNDEFINED,

  /**
   * The deployment status is not deployed.
   */
  @Json(name = "notDeployed")
  NOT_DEPLOYED,

  /**
   * The deployment status is inprogress.
   */
  @Json(name = "inProgress")
  IN_PROGRESS,

  /**
   * The deployment status is succeeded.
   */
  @Json(name = "succeeded")
  SUCCEEDED,

  /**
   * The deployment status is partiallysucceeded.
   */
  @Json(name = "partiallySucceeded")
  PARTIALLY_SUCCEEDED,

  /**
   * The deployment status is failed.
   */
  @Json(name = "failed")
  FAILED,

  /**
   * The deployment status is all.
   */
  @Json(name = "all")
  ALL
}
