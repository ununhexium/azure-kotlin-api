package net.lab0.azure.model.definition.git

import kotlin.Int

interface CommentPosition {
  /**
   * The line number of a thread's position. Starts at 1.
   */
  val line: Int

  /**
   * The character offset of a thread's position inside of a line. Starts at 0.
   */
  val offset: Int
}
