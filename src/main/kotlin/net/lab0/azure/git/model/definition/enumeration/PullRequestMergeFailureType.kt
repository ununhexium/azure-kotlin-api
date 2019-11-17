package net.lab0.azure.git.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The type of failure (if any) of the pull request merge.
 */
enum class PullRequestMergeFailureType {
  /**
   * Type is not set. Default type.
   */
  @Json(name = "none")
  NONE,

  /**
   * Pull request merge failure type unknown.
   */
  @Json(name = "unknown")
  UNKNOWN,

  /**
   * Pull request merge failed due to case mismatch.
   */
  @Json(name = "caseSensitive")
  CASE_SENSITIVE,

  /**
   * Pull request merge failed due to an object being too large.
   */
  @Json(name = "objectTooLarge")
  OBJECT_TOO_LARGE
}
