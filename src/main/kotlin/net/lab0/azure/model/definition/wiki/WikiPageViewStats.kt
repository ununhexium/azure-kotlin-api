package net.lab0.azure.model.definition.wiki

import kotlin.Int
import kotlin.String

/**
 * Defines properties for wiki page view stats.
 */
interface WikiPageViewStats {
  /**
   * Wiki page view count.
   */
  val count: Int

  /**
   * Wiki page last viewed time.
   */
  val lastViewedTime: String

  /**
   * Wiki page path.
   */
  val path: String
}
