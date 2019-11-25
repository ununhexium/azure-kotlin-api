package net.lab0.azure.model.definition.search

import kotlin.Int

/**
 * Describes the position of a piece of text in a document.
 */
interface Hit {
  /**
   * Gets or sets the start character offset of a piece of text.
   */
  val charOffset: Int

  /**
   * Gets or sets the length of a piece of text.
   */
  val length: Int
}
