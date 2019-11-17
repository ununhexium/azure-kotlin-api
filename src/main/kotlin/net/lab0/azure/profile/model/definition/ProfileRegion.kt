package net.lab0.azure.profile.model.definition

import kotlin.String

/**
 * Country/region information
 */
interface ProfileRegion {
  /**
   * The two-letter code defined in ISO 3166 for the country/region.
   */
  val code: String

  /**
   * Localized country/region name
   */
  val name: String
}
