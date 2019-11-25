package net.lab0.azure.model.definition.wiki

import kotlin.String
import kotlin.collections.List

/**
 * Response contract for the Wiki Pages PUT, PATCH and DELETE APIs.
 */
interface WikiPageResponse {
  /**
   * Contains the list of ETag values from the response header of the pages API call. The first item
   * in the list contains the version of the wiki page.
   */
  val eTag: List<String>

  val page: WikiPage
}
