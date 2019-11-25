package net.lab0.azure.model.definition.enumeration.wiki

import com.squareup.moshi.Json

/**
 * Version type (branch, tag, or commit). Determines how Id is interpreted
 */
enum class GitVersionType {
  /**
   * Interpret the version as a branch name
   */
  @Json(name = "branch")
  BRANCH,

  /**
   * Interpret the version as a tag name
   */
  @Json(name = "tag")
  TAG,

  /**
   * Interpret the version as a commit ID (SHA1)
   */
  @Json(name = "commit")
  COMMIT
}
