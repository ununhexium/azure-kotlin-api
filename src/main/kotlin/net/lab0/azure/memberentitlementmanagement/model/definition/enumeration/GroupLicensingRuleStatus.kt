package net.lab0.azure.memberentitlementmanagement.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The status of the group rule.
 */
enum class GroupLicensingRuleStatus {
  /**
   * Rule is created or updated, but apply is pending
   */
  @Json(name = "applyPending")
  APPLY_PENDING,

  /**
   * Rule is applied
   */
  @Json(name = "applied")
  APPLIED,

  /**
   * The group rule was incompatible
   */
  @Json(name = "incompatible")
  INCOMPATIBLE,

  /**
   * Rule failed to apply unexpectedly and should be retried
   */
  @Json(name = "unableToApply")
  UNABLE_TO_APPLY
}
