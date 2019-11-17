package net.lab0.azure.git.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The current status of the pull request merge.
 */
enum class PullRequestAsyncStatus {
  /**
   * Status is not set. Default state.
   */
  @Json(name = "notSet")
  NOT_SET,

  /**
   * Pull request merge is queued.
   */
  @Json(name = "queued")
  QUEUED,

  /**
   * Pull request merge failed due to conflicts.
   */
  @Json(name = "conflicts")
  CONFLICTS,

  /**
   * Pull request merge succeeded.
   */
  @Json(name = "succeeded")
  SUCCEEDED,

  /**
   * Pull request merge rejected by policy.
   */
  @Json(name = "rejectedByPolicy")
  REJECTED_BY_POLICY,

  /**
   * Pull request merge failed.
   */
  @Json(name = "failure")
  FAILURE
}
