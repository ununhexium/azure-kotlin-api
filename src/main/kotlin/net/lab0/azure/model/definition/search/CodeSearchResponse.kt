package net.lab0.azure.model.definition.search

import kotlin.Int
import kotlin.collections.List

/**
 * Defines a code search response item.
 */
interface CodeSearchResponse : EntitySearchResponse {
  /**
   * Total number of matched files.
   */
  val count: Int

  /**
   * List of matched files.
   */
  val results: List<CodeResult>
}
