package net.lab0.azure.model.definition.enumeration.git

import com.squareup.moshi.Json

/**
 * What Git history mode should be used. This only applies to the search criteria when Ids = null
 * and an itemPath is specified.
 */
enum class GitHistoryMode {
  /**
   * The history mode used by `git log`. This is the default.
   */
  @Json(name = "simplifiedHistory")
  SIMPLIFIED_HISTORY,

  /**
   * The history mode used by `git log --first-parent`
   */
  @Json(name = "firstParent")
  FIRST_PARENT,

  /**
   * The history mode used by `git log --full-history`
   */
  @Json(name = "fullHistory")
  FULL_HISTORY,

  /**
   * The history mode used by `git log --full-history --simplify-merges`
   */
  @Json(name = "fullHistorySimplifyMerges")
  FULL_HISTORY_SIMPLIFY_MERGES
}
