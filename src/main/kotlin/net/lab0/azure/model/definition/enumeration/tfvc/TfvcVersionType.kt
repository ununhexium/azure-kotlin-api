package net.lab0.azure.model.definition.enumeration.tfvc

import com.squareup.moshi.Json

/**
 * Defaults to Latest.
 */
enum class TfvcVersionType {
  /**
   * Version is treated as a ChangesetId.
   */
  @Json(name = "none")
  NONE,

  /**
   * Version is treated as a ChangesetId.
   */
  @Json(name = "changeset")
  CHANGESET,

  /**
   * Version is treated as a Shelveset name and owner.
   */
  @Json(name = "shelveset")
  SHELVESET,

  /**
   * Version is treated as a Change.
   */
  @Json(name = "change")
  CHANGE,

  /**
   * Version is treated as a Date.
   */
  @Json(name = "date")
  DATE,

  /**
   * If Version is defined the Latest of that Version will be used, if no version is defined the
   * latest ChangesetId will be used.
   */
  @Json(name = "latest")
  LATEST,

  /**
   * Version will be treated as a Tip, if no version is defined latest will be used.
   */
  @Json(name = "tip")
  TIP,

  /**
   * Version will be treated as a MergeSource.
   */
  @Json(name = "mergeSource")
  MERGE_SOURCE
}
