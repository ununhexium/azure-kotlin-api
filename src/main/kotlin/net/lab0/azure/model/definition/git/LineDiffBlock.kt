package net.lab0.azure.model.definition.git

import kotlin.Int
import net.lab0.azure.model.definition.enumeration.git.LineDiffBlockChangeType

/**
 * The class to represent the line diff block
 */
interface LineDiffBlock {
  /**
   * Type of change that was made to the block.
   */
  val changeType: LineDiffBlockChangeType

  /**
   * Line number where this block starts in modified file.
   */
  val modifiedLineNumberStart: Int

  /**
   * Count of lines in this block in modified file.
   */
  val modifiedLinesCount: Int

  /**
   * Line number where this block starts in original file.
   */
  val originalLineNumberStart: Int

  /**
   * Count of lines in this block in original file.
   */
  val originalLinesCount: Int
}
