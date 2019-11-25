package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String
import net.lab0.azure.model.definition.enumeration.extensionmanagement.ContributionLicensingBehaviorType

/**
 * Maps a contribution to a licensing behavior
 */
interface LicensingOverride {
  /**
   * How the inclusion of this contribution should change based on licensing
   */
  val behavior: ContributionLicensingBehaviorType

  /**
   * Fully qualified contribution id which we want to define licensing behavior for
   */
  val id: String
}
