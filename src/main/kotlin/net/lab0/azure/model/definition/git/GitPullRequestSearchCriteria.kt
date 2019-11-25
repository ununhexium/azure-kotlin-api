package net.lab0.azure.model.definition.git

import kotlin.Boolean
import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.PullRequestStatus

/**
 * Pull requests can be searched for matching this criteria.
 */
interface GitPullRequestSearchCriteria {
  /**
   * If set, search for pull requests that were created by this identity.
   */
  val creatorId: String

  /**
   * Whether to include the _links field on the shallow references
   */
  val includeLinks: Boolean

  /**
   * If set, search for pull requests whose target branch is in this repository.
   */
  val repositoryId: String

  /**
   * If set, search for pull requests that have this identity as a reviewer.
   */
  val reviewerId: String

  /**
   * If set, search for pull requests from this branch.
   */
  val sourceRefName: String

  /**
   * If set, search for pull requests whose source branch is in this repository.
   */
  val sourceRepositoryId: String

  /**
   * If set, search for pull requests that are in this state. Defaults to Active if unset.
   */
  val status: PullRequestStatus

  /**
   * If set, search for pull requests into this branch.
   */
  val targetRefName: String
}
