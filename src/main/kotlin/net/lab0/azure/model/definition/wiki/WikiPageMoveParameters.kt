package net.lab0.azure.model.definition.wiki

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
