package net.lab0.azure.search.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.collections.List

/**
 * Base contract for search request types without scroll support.
 */
interface EntitySearchRequest : EntitySearchRequestBase {
  /**
   * Options for sorting search results. If set to null, the results will be returned sorted by
   * relevance. If more than one sort option is provided, the results are sorted in the order specified
   * in the OrderBy.
   */
  val orderBy: List<SortOption>

  /**
   * Number of results to be skipped.
   */
  val skip: Int

  /**
   * Number of results to be returned.
   */
  val top: Int

  /**
   * Flag to opt for faceting in the result. Default behavior is false.
   */
  val includeFacets: Boolean
}
