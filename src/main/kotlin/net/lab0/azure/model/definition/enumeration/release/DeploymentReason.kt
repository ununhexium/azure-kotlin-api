package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

/**
 * Gets reason of deployment.
 */
enum class DeploymentReason {
  /**
   * The deployment reason is none.
   */
  @Json(name = "none")
  NONE,

  /**
   * The deployment reason is manual.
   */
  @Json(name = "manual")
  MANUAL,

  /**
   * The deployment reason is automated.
   */
  @Json(name = "automated")
  AUTOMATED,

  /**
   * The deployment reason is scheduled.
   */
  @Json(name = "scheduled")
  SCHEDULED,

  /**
   * The deployment reason is RedeployTrigger.
   */
  @Json(name = "redeployTrigger")
  REDEPLOY_TRIGGER
}
