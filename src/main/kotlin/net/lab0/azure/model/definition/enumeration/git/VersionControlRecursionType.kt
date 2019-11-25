package net.lab0.azure.model.definition.enumeration.git

import com.squareup.moshi.Json

/**
 * Specifies whether to include children (OneLevel), all descendants (Full), or None
 */
enum class VersionControlRecursionType {
  /**
   * Only return the specified item.
   */
  @Json(name = "none")
  NONE,

  /**
   * Return the specified item and its direct children.
   */
  @Json(name = "oneLevel")
  ONE_LEVEL,

  /**
   * Return the specified item and its direct children, as well as recursive chains of nested child
   * folders that only contain a single folder.
   */
  @Json(name = "oneLevelPlusNestedEmptyFolders")
  ONE_LEVEL_PLUS_NESTED_EMPTY_FOLDERS,

  /**
   * Return specified item and all descendants
   */
  @Json(name = "full")
  FULL
}
