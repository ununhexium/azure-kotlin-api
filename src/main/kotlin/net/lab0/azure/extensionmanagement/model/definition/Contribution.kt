package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * An individual contribution made by an extension
 */
interface Contribution : ContributionBase {
  /**
   * List of constraints (filters) that should be applied to the availability of this contribution
   */
  val constraints: List<ContributionConstraint>

  /**
   * Includes is a set of contributions that should have this contribution included in their targets
   * list.
   */
  val includes: List<String>

  val properties: JObject

  /**
   * List of demanded claims in order for the user to see this contribution (like anonymous, public,
   * member...).
   */
  val restrictedTo: List<String>

  /**
   * The ids of the contribution(s) that this contribution targets. (parent contributions)
   */
  val targets: List<String>

  /**
   * Id of the Contribution Type
   */
  val type: String
}
