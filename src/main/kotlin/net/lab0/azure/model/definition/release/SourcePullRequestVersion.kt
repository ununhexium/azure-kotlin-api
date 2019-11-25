package net.lab0.azure.model.definition.release

import kotlin.String

interface SourcePullRequestVersion {
  /**
   * Pull Request Id for which the release will publish status
   */
  val pullRequestId: String

  val pullRequestMergedAt: String

  /**
   * Source branch commit Id of the Pull Request for which the release will publish status
   */
  val sourceBranchCommitId: String
}
