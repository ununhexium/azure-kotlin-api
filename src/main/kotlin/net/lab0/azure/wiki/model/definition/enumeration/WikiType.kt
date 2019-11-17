package net.lab0.azure.wiki.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Type of the wiki.
 */
enum class WikiType {
  /**
   * Indicates that the wiki is provisioned for the team project
   */
  @Json(name = "projectWiki")
  PROJECT_WIKI,

  /**
   * Indicates that the wiki is published from a git repository
   */
  @Json(name = "codeWiki")
  CODE_WIKI
}
