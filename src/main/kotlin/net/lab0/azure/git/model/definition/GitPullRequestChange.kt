package net.lab0.azure.git.model.definition

import kotlin.Int

/**
 * Change made in a pull request.
 */
interface GitPullRequestChange : GitChange {
  /**
   * ID used to track files through multiple changes.
   */
  val changeTrackingId: Int
}
