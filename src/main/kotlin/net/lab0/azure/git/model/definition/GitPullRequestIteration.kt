package net.lab0.azure.git.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.git.model.definition.enumeration.IterationReason

/**
 * Provides properties that describe a Git pull request iteration. Iterations are created as a
 * result of creating and pushing updates to a pull request.
 */
interface GitPullRequestIteration {
  val _links: ReferenceLinks

  val author: IdentityRef

  /**
   * Changes included with the pull request iteration.
   */
  val changeList: List<GitPullRequestChange>

  /**
   * The commits included with the pull request iteration.
   */
  val commits: List<GitCommitRef>

  val commonRefCommit: GitCommitRef

  /**
   * The creation date of the pull request iteration.
   */
  val createdDate: String

  /**
   * Description of the pull request iteration.
   */
  val description: String

  /**
   * Indicates if the Commits property contains a truncated list of commits in this pull request
   * iteration.
   */
  val hasMoreCommits: Boolean

  /**
   * ID of the pull request iteration. Iterations are created as a result of creating and pushing
   * updates to a pull request.
   */
  val id: Int

  /**
   * If the iteration reason is Retarget, this is the refName of the new target
   */
  val newTargetRefName: String

  /**
   * If the iteration reason is Retarget, this is the original target refName
   */
  val oldTargetRefName: String

  val push: GitPushRef

  /**
   * The reason for which the pull request iteration was created.
   */
  val reason: IterationReason

  val sourceRefCommit: GitCommitRef

  val targetRefCommit: GitCommitRef

  /**
   * The updated date of the pull request iteration.
   */
  val updatedDate: String
}
