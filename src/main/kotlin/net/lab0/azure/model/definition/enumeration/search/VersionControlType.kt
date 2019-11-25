package net.lab0.azure.model.definition.enumeration.search

import com.squareup.moshi.Json

/**
 * Version control type of the result file.
 */
enum class VersionControlType {
  @Json(name = "git")
  GIT,

  @Json(name = "tfvc")
  TFVC,

  /**
   * For internal use.
   */
  @Json(name = "custom")
  CUSTOM
}
