package net.lab0.azure.model.definition.work

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Represents a single pre-defined query.
 */
interface PredefinedQuery {
  /**
   * Whether or not the query returned the complete set of data or if the data was truncated.
   */
  val hasMore: Boolean

  /**
   * Id of the query
   */
  val id: String

  /**
   * Localized name of the query
   */
  val name: String

  /**
   * The results of the query.  This will be a set of WorkItem objects with only the 'id' set.  The
   * client is responsible for paging in the data as needed.
   */
  val results: List<WorkItem>

  /**
   * REST API Url to use to retrieve results for this query
   */
  val url: String

  /**
   * Url to use to display a page in the browser with the results of this query
   */
  val webUrl: String
}
