package net.lab0.azure.git.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Provides properties that describe file differences
 */
interface FileDiff {
  /**
   * The collection of line diff blocks
   */
  val lineDiffBlocks: List<LineDiffBlock>

  /**
   * Original path of item if different from current path.
   */
  val originalPath: String

  /**
   * Current path of item
   */
  val path: String
}
