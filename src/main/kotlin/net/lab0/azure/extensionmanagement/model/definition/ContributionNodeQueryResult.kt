package net.lab0.azure.extensionmanagement.model.definition

import javax.json.JsonObject

/**
 * Result of a contribution node query.  Wraps the resulting contribution nodes and provider
 * details.
 */
interface ContributionNodeQueryResult {
  /**
   * Map of contribution ids to corresponding node.
   */
  val nodes: JsonObject

  /**
   * Map of provder ids to the corresponding provider details object.
   */
  val providerDetails: JsonObject
}
