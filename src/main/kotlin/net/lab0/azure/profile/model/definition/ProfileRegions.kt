package net.lab0.azure.profile.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Container of country/region information
 */
interface ProfileRegions {
  /**
   * List of country/region code with contact consent requirement type of notice
   */
  val noticeContactConsentRequirementRegions: List<String>

  /**
   * List of country/region code with contact consent requirement type of opt-out
   */
  val optOutContactConsentRequirementRegions: List<String>

  /**
   * List of country/regions
   */
  val regions: List<ProfileRegion>
}
