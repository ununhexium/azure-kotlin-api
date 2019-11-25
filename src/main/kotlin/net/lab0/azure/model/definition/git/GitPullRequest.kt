package net.lab0.azure.model.definition.git

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.git.PullRequestAsyncStatus
import net.lab0.azure.model.definition.enumeration.git.PullRequestMergeFailureType
import net.lab0.azure.model.definition.enumeration.git.PullRequestStatus

/**
 * Represents all the data associated with a pull request.
 */
interface GitPullRequest {
  val _links: ReferenceLinks

  /**
   * A string which uniquely identifies this pull request. To generate an artifact ID for a pull
   * request, use this template:
   * ```vstfs:///Git/PullRequestId/{projectId}/{repositoryId}/{pullRequestId}```
   */
  val artifactId: String

  val autoCompleteSetBy: IdentityRef

  val closedBy: IdentityRef

  /**
   * The date when the pull request was closed (completed, abandoned, or merged externally).
   */
  val closedDate: String

  /**
   * The code review ID of the pull request. Used internally.
   */
  val codeReviewId: Int

  /**
   * The commits contained in the pull request.
   */
  val commits: List<GitCommitRef>

  val completionOptions: GitPullRequestCompletionOptions

  /**
   * The most recent date at which the pull request entered the queue to be completed. Used
   * internally.
   */
  val completionQueueTime: String

  val createdBy: IdentityRef

  /**
   * The date when the pull request was created.
   */
  val creationDate: String

  /**
   * The description of the pull request.
   */
  val description: String

  val forkSource: GitForkRef

  /**
   * Draft / WIP pull request.
   */
  val isDraft: Boolean

  /**
   * The labels associated with the pull request.
   */
  val labels: List<WebApiTagDefinition>

  val lastMergeCommit: GitCommitRef

  val lastMergeSourceCommit: GitCommitRef

  val lastMergeTargetCommit: GitCommitRef

  /**
   * If set, pull request merge failed for this reason.
   */
  val mergeFailureMessage: String

  /**
   * The type of failure (if any) of the pull request merge.
   */
  val mergeFailureType: PullRequestMergeFailureType

  /**
   * The ID of the job used to run the pull request merge. Used internally.
   */
  val mergeId: String

  val mergeOptions: GitPullRequestMergeOptions

  /**
   * The current status of the pull request merge.
   */
  val mergeStatus: PullRequestAsyncStatus

  /**
   * The ID of the pull request.
   */
  val pullRequestId: Int

  /**
   * Used internally.
   */
  val remoteUrl: String

  val repository: GitRepository

  /**
   * A list of reviewers on the pull request along with the state of their votes.
   */
  val reviewers: List<IdentityRefWithVote>

  /**
   * The name of the source branch of the pull request.
   */
  val sourceRefName: String

  /**
   * The status of the pull request.
   */
  val status: PullRequestStatus

  /**
   * If true, this pull request supports multiple iterations. Iteration support means individual
   * pushes to the source branch of the pull request can be reviewed and comments left in one iteration
   * will be tracked across future iterations.
   */
  val supportsIterations: Boolean

  /**
   * The name of the target branch of the pull request.
   */
  val targetRefName: String

  /**
   * The title of the pull request.
   */
  val title: String

  /**
   * Used internally.
   */
  val url: String

  /**
   * Any work item references associated with this pull request.
   */
  val workItemRefs: List<ResourceRef>
}
