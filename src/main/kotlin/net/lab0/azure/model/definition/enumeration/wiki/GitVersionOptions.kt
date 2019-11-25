package net.lab0.azure.model.definition.enumeration.wiki

import com.squareup.moshi.Json

/**
 * Version options - Specify additional modifiers to version (e.g Previous)
 */
enum class GitVersionOptions {
  /**
   * Not specified
   */
  @Json(name = "none")
  NONE,

  /**
   * Commit that changed item prior to the current version
   */
  @Json(name = "previousChange")
  PREVIOUS_CHANGE,

  /**
   * First parent of commit (HEAD^)
   */
  @Json(name = "firstParent")
  FIRST_PARENT
}
