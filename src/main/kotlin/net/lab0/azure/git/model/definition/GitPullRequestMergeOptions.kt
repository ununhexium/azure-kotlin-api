package net.lab0.azure.git.model.definition

import kotlin.Boolean

/**
 * The options which are used when a pull request merge is created.
 */
interface GitPullRequestMergeOptions {
  val detectRenameFalsePositives: Boolean

  /**
   * If true, rename detection will not be performed during the merge.
   */
  val disableRenames: Boolean
}
