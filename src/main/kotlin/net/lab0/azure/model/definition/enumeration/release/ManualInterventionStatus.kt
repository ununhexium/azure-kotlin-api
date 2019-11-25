package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

/**
 * Gets or sets the status of the manual intervention.
 */
enum class ManualInterventionStatus {
  /**
   * The manual intervention does not have the status set.
   */
  @Json(name = "unknown")
  UNKNOWN,

  /**
   * The manual intervention is pending.
   */
  @Json(name = "pending")
  PENDING,

  /**
   * The manual intervention is rejected.
   */
  @Json(name = "rejected")
  REJECTED,

  /**
   * The manual intervention is approved.
   */
  @Json(name = "approved")
  APPROVED,

  /**
   * The manual intervention is canceled.
   */
  @Json(name = "canceled")
  CANCELED
}
