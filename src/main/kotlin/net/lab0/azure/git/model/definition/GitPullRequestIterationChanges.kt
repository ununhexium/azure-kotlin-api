package net.lab0.azure.git.model.definition

import kotlin.Int
import kotlin.collections.List

/**
 * Collection of changes made in a pull request.
 */
interface GitPullRequestIterationChanges {
  /**
   * Changes made in the iteration.
   */
  val changeEntries: List<GitPullRequestChange>

  /**
   * Value to specify as skip to get the next page of changes.  This will be zero if there are no
   * more changes.
   */
  val nextSkip: Int

  /**
   * Value to specify as top to get the next page of changes.  This will be zero if there are no
   * more changes.
   */
  val nextTop: Int
}
