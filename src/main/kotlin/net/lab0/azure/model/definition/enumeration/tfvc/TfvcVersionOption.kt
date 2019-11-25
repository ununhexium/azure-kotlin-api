package net.lab0.azure.model.definition.enumeration.tfvc

import com.squareup.moshi.Json

/**
 * Defaults to None.
 */
enum class TfvcVersionOption {
  /**
   * None.
   */
  @Json(name = "none")
  NONE,

  /**
   * Return the previous version.
   */
  @Json(name = "previous")
  PREVIOUS,

  /**
   * Only usuable with versiontype MergeSource and integer versions, uses RenameSource identifier
   * instead of Merge identifier.
   */
  @Json(name = "useRename")
  USE_RENAME
}
