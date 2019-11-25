package net.lab0.azure.model.definition.enumeration.git

import com.squareup.moshi.Json

/**
 * The type of query to perform.
 */
enum class GitPullRequestQueryType {
  /**
   * No query type set.
   */
  @Json(name = "notSet")
  NOT_SET,

  /**
   * Search for pull requests that created the supplied merge commits.
   */
  @Json(name = "lastMergeCommit")
  LAST_MERGE_COMMIT,

  /**
   * Search for pull requests that merged the supplied commits.
   */
  @Json(name = "commit")
  COMMIT
}
