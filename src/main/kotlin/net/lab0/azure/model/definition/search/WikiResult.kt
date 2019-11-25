package net.lab0.azure.model.definition.search

import kotlin.String
import kotlin.collections.List

/**
 * Defines the wiki result that matched a wiki search request.
 */
interface WikiResult {
  val collection: Collection

  /**
   * ContentId of the result file.
   */
  val contentId: String

  /**
   * Name of the result file.
   */
  val fileName: String

  /**
   * Highlighted snippets of fields that match the search request. The list is sorted by relevance
   * of the snippets.
   */
  val hits: List<WikiHit>

  /**
   * Path at which result file is present.
   */
  val path: String

  val project: ProjectReference

  val wiki: Wiki
}
