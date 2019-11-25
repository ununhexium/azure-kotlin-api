package net.lab0.azure.model.definition.enumeration.policy

import com.squareup.moshi.Json

/**
 * Status of the policy (Running, Approved, Failed, etc.)
 */
enum class PolicyEvaluationStatus {
  /**
   * The policy is either queued to run, or is waiting for some event before progressing.
   */
  @Json(name = "queued")
  QUEUED,

  /**
   * The policy is currently running.
   */
  @Json(name = "running")
  RUNNING,

  /**
   * The policy has been fulfilled for this pull request.
   */
  @Json(name = "approved")
  APPROVED,

  /**
   * The policy has rejected this pull request.
   */
  @Json(name = "rejected")
  REJECTED,

  /**
   * The policy does not apply to this pull request.
   */
  @Json(name = "notApplicable")
  NOT_APPLICABLE,

  /**
   * The policy has encountered an unexpected error.
   */
  @Json(name = "broken")
  BROKEN
}
