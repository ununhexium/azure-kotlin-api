package net.lab0.azure.model.definition.enumeration.extensionmanagement

import com.squareup.moshi.Json

/**
 * How the inclusion of this contribution should change based on licensing
 */
enum class ContributionLicensingBehaviorType {
  /**
   * Default value - only include the contribution if the user is licensed for the extension
   */
  @Json(name = "onlyIfLicensed")
  ONLY_IF_LICENSED,

  /**
   * Only include the contribution if the user is NOT licensed for the extension
   */
  @Json(name = "onlyIfUnlicensed")
  ONLY_IF_UNLICENSED,

  /**
   * Always include the contribution regardless of whether or not the user is licensed for the
   * extension
   */
  @Json(name = "alwaysInclude")
  ALWAYS_INCLUDE
}
