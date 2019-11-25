package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String
import kotlin.collections.List

/**
 * Representaion of a ContributionNode that can be used for serialized to clients.
 */
interface ClientContribution {
  /**
   * Description of the contribution/type
   */
  val description: String

  /**
   * Fully qualified identifier of the contribution/type
   */
  val id: String

  /**
   * Includes is a set of contributions that should have this contribution included in their targets
   * list.
   */
  val includes: List<String>

  val properties: JObject

  /**
   * The ids of the contribution(s) that this contribution targets. (parent contributions)
   */
  val targets: List<String>

  /**
   * Id of the Contribution Type
   */
  val type: String
}
