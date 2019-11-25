package net.lab0.azure.model.definition.git

import kotlin.String

interface CommentThreadContext {
  /**
   * File path relative to the root of the repository. It's up to the client to use any path format.
   */
  val filePath: String

  val leftFileEnd: CommentPosition

  val leftFileStart: CommentPosition

  val rightFileEnd: CommentPosition

  val rightFileStart: CommentPosition
}
