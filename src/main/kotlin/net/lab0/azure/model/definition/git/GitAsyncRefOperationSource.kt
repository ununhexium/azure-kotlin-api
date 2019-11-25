package net.lab0.azure.model.definition.git

import kotlin.Int
import kotlin.collections.List

/**
 * GitAsyncRefOperationSource specifies the pull request or list of commits to use when making a
 * cherry pick and revert operation request. Only one should be provided.
 */
interface GitAsyncRefOperationSource {
  /**
   * A list of commits to cherry pick or revert
   */
  val commitList: List<GitCommitRef>

  /**
   * Id of the pull request to cherry pick or revert
   */
  val pullRequestId: Int
}
