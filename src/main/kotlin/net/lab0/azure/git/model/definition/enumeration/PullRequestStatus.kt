package net.lab0.azure.git.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The status of the pull request.
 */
enum class PullRequestStatus {
  /**
   * Status not set. Default state.
   */
  @Json(name = "notSet")
  NOT_SET,

  /**
   * Pull request is active.
   */
  @Json(name = "active")
  ACTIVE,

  /**
   * Pull request is abandoned.
   */
  @Json(name = "abandoned")
  ABANDONED,

  /**
   * Pull request is completed.
   */
  @Json(name = "completed")
  COMPLETED,

  /**
   * Used in pull request search criterias to include all statuses.
   */
  @Json(name = "all")
  ALL
}
