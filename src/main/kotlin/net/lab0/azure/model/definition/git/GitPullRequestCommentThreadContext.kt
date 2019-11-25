package net.lab0.azure.model.definition.git

import kotlin.Int

/**
 * Comment thread context contains details about what diffs were being viewed at the time of thread
 * creation and whether or not the thread has been tracked from that original diff.
 */
interface GitPullRequestCommentThreadContext {
  /**
   * Used to track a comment across iterations. This value can be found by looking at the
   * iteration's changes list. Must be set for pull requests with iteration support. Otherwise, it's
   * not required for 'legacy' pull requests.
   */
  val changeTrackingId: Int

  val iterationContext: CommentIterationContext

  val trackingCriteria: CommentTrackingCriteria
}
