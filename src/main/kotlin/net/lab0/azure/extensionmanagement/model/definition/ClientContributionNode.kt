package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Representaion of a ContributionNode that can be used for serialized to clients.
 */
interface ClientContributionNode {
  /**
   * List of ids for contributions which are children to the current contribution.
   */
  val children: List<String>

  val contribution: ClientContribution

  /**
   * List of ids for contributions which are parents to the current contribution.
   */
  val parents: List<String>
}
