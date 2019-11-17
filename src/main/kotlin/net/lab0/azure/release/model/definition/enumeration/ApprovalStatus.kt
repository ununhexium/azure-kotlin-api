package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Gets or sets the status of the approval.
 */
enum class ApprovalStatus {
  @Json(name = "undefined")
  UNDEFINED,

  @Json(name = "pending")
  PENDING,

  @Json(name = "approved")
  APPROVED,

  @Json(name = "rejected")
  REJECTED,

  @Json(name = "reassigned")
  REASSIGNED,

  @Json(name = "canceled")
  CANCELED,

  @Json(name = "skipped")
  SKIPPED
}
