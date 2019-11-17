package net.lab0.azure.git.model.definition

import kotlin.Boolean
import kotlin.String

/**
 * Preferences about how the pull request should be completed.
 */
interface GitPullRequestCompletionOptions {
  /**
   * If true, policies will be explicitly bypassed while the pull request is completed.
   */
  val bypassPolicy: Boolean

  /**
   * If policies are bypassed, this reason is stored as to why bypass was used.
   */
  val bypassReason: String

  /**
   * If true, the source branch of the pull request will be deleted after completion.
   */
  val deleteSourceBranch: Boolean

  /**
   * If set, this will be used as the commit message of the merge commit.
   */
  val mergeCommitMessage: String

  /**
   * If true, the commits in the pull request will be squash-merged into the specified target branch
   * on completion.
   */
  val squashMerge: Boolean

  /**
   * If true, we will attempt to transition any work items linked to the pull request into the next
   * logical state (i.e. Active -> Resolved)
   */
  val transitionWorkItems: Boolean

  /**
   * If true, the current completion attempt was triggered via auto-complete. Used internally.
   */
  val triggeredByAutoComplete: Boolean
}
