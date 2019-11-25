package net.lab0.azure.model.definition.enumeration.memberentitlementmanagement

import com.squareup.moshi.Json

/**
 * Minimum License Required for the Extension.
 */
enum class MinimumRequiredServiceLevel {
  /**
   * No service rights. The user cannot access the account
   */
  @Json(name = "none")
  NONE,

  /**
   * Default or minimum service level
   */
  @Json(name = "express")
  EXPRESS,

  /**
   * Premium service level - either by purchasing on the Azure portal or by purchasing the
   * appropriate MSDN subscription
   */
  @Json(name = "advanced")
  ADVANCED,

  /**
   * Only available to a specific set of MSDN Subscribers
   */
  @Json(name = "advancedPlus")
  ADVANCED_PLUS,

  /**
   * Stakeholder service level
   */
  @Json(name = "stakeholder")
  STAKEHOLDER
}
