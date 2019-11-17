package net.lab0.azure.wiki.model.definition

import kotlin.Int
import kotlin.String

/**
 * Contract encapsulating parameters for the page move operation.
 */
interface WikiPageMoveParameters {
  /**
   * New order of the wiki page.
   */
  val newOrder: Int

  /**
   * New path of the wiki page.
   */
  val newPath: String

  /**
   * Current path of the wiki page.
   */
  val path: String
}
