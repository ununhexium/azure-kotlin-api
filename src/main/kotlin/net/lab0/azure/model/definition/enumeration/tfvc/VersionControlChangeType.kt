package net.lab0.azure.model.definition.enumeration.tfvc

import com.squareup.moshi.Json

/**
 * The type of change that was made to the item.
 */
enum class VersionControlChangeType {
  @Json(name = "none")
  NONE,

  @Json(name = "add")
  ADD,

  @Json(name = "edit")
  EDIT,

  @Json(name = "encoding")
  ENCODING,

  @Json(name = "rename")
  RENAME,

  @Json(name = "delete")
  DELETE,

  @Json(name = "undelete")
  UNDELETE,

  @Json(name = "branch")
  BRANCH,

  @Json(name = "merge")
  MERGE,

  @Json(name = "lock")
  LOCK,

  @Json(name = "rollback")
  ROLLBACK,

  @Json(name = "sourceRename")
  SOURCE_RENAME,

  @Json(name = "targetRename")
  TARGET_RENAME,

  @Json(name = "property")
  PROPERTY,

  @Json(name = "all")
  ALL
}
