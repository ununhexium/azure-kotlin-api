package net.lab0.azure.model.definition.git

import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Ahead and behind counts for a particular ref.
 */
interface GitBranchStats {
  /**
   * Number of commits ahead.
   */
  val aheadCount: Int

  /**
   * Number of commits behind.
   */
  val behindCount: Int

  val commit: GitCommitRef

  /**
   * True if this is the result for the base version.
   */
  val isBaseVersion: Boolean

  /**
   * Name of the ref.
   */
  val name: String
}
