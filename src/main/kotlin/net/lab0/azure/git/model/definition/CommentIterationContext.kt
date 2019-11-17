package net.lab0.azure.git.model.definition

import kotlin.Int

/**
 * Comment iteration context is used to identify which diff was being viewed when the thread was
 * created.
 */
interface CommentIterationContext {
  /**
   * The iteration of the file on the left side of the diff when the thread was created. If this
   * value is equal to SecondComparingIteration, then this version is the common commit between the
   * source and target branches of the pull request.
   */
  val firstComparingIteration: Int

  /**
   * The iteration of the file on the right side of the diff when the thread was created.
   */
  val secondComparingIteration: Int
}
