package net.lab0.azure.wiki.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Response contract for the Wiki Page Move API.
 */
interface WikiPageMoveResponse {
  /**
   * Contains the list of ETag values from the response header of the page move API call. The first
   * item in the list contains the version of the wiki page subject to page move.
   */
  val eTag: List<String>

  val pageMove: WikiPageMove
}
