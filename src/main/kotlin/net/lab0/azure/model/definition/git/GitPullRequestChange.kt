package net.lab0.azure.model.definition.git

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
