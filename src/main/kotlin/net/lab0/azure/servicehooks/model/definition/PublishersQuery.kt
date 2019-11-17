package net.lab0.azure.servicehooks.model.definition

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

/**
 * Defines a query for service hook publishers.
 */
interface PublishersQuery {
  /**
   * Optional list of publisher ids to restrict the results to
   */
  val publisherIds: List<String>

  /**
   * Filter for publisher inputs
   */
  val publisherInputs: JsonObject

  /**
   * Results from the query
   */
  val results: List<Publisher>
}
