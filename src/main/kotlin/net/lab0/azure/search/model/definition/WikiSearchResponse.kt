package net.lab0.azure.search.model.definition

import kotlin.Int
import kotlin.collections.List

/**
 * Defines a wiki search response item.
 */
interface WikiSearchResponse : EntitySearchResponse {
  /**
   * Total number of matched wiki documents.
   */
  val count: Int

  /**
   * List of top matched wiki documents.
   */
  val results: List<WikiResult>
}
