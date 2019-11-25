package net.lab0.azure.model.definition.git

import kotlin.Int
import kotlin.String

/**
 * Comment tracking criteria is used to identify which iteration context the thread has been tracked
 * to (if any) along with some detail about the original position and filename.
 */
interface CommentTrackingCriteria {
  /**
   * The iteration of the file on the left side of the diff that the thread will be tracked to.
   * Threads were tracked if this is greater than 0.
   */
  val firstComparingIteration: Int

  /**
   * Original filepath the thread was created on before tracking. This will be different than the
   * current thread filepath if the file in question was renamed in a later iteration.
   */
  val origFilePath: String

  val origLeftFileEnd: CommentPosition

  val origLeftFileStart: CommentPosition

  val origRightFileEnd: CommentPosition

  val origRightFileStart: CommentPosition

  /**
   * The iteration of the file on the right side of the diff that the thread will be tracked to.
   * Threads were tracked if this is greater than 0.
   */
  val secondComparingIteration: Int
}
