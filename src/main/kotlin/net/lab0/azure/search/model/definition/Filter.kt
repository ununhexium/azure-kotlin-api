package net.lab0.azure.search.model.definition

import kotlin.Int
import kotlin.String

/**
 * Describes a filter bucket item representing the total matches of search result, name and id.
 */
interface Filter {
  /**
   * Id of the filter bucket.
   */
  val id: String

  /**
   * Name of the filter bucket.
   */
  val name: String

  /**
   * Count of matches in the filter bucket.
   */
  val resultCount: Int
}
