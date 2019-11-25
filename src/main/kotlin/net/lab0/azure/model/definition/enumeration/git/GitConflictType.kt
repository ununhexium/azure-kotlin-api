package net.lab0.azure.model.definition.enumeration.git

import com.squareup.moshi.Json

enum class GitConflictType {
  /**
   * No conflict
   */
  @Json(name = "none")
  NONE,

  /**
   * Added on source and target; content differs
   */
  @Json(name = "addAdd")
  ADD_ADD,

  /**
   * Added on source and rename destination on target
   */
  @Json(name = "addRename")
  ADD_RENAME,

  /**
   * Deleted on source and edited on target
   */
  @Json(name = "deleteEdit")
  DELETE_EDIT,

  /**
   * Deleted on source and renamed on target
   */
  @Json(name = "deleteRename")
  DELETE_RENAME,

  /**
   * Path is a directory on source and a file on target
   */
  @Json(name = "directoryFile")
  DIRECTORY_FILE,

  /**
   * Children of directory which has DirectoryFile or FileDirectory conflict
   */
  @Json(name = "directoryChild")
  DIRECTORY_CHILD,

  /**
   * Edited on source and deleted on target
   */
  @Json(name = "editDelete")
  EDIT_DELETE,

  /**
   * Edited on source and target; content differs
   */
  @Json(name = "editEdit")
  EDIT_EDIT,

  /**
   * Path is a file on source and a directory on target
   */
  @Json(name = "fileDirectory")
  FILE_DIRECTORY,

  /**
   * Same file renamed on both source and target; destination paths differ
   */
  @Json(name = "rename1to2")
  RENAME1TO2,

  /**
   * Different files renamed to same destination path on both source and target
   */
  @Json(name = "rename2to1")
  RENAME2TO1,

  /**
   * Rename destination on source and new file on target
   */
  @Json(name = "renameAdd")
  RENAME_ADD,

  /**
   * Renamed on source and deleted on target
   */
  @Json(name = "renameDelete")
  RENAME_DELETE,

  /**
   * Rename destination on both source and target; content differs
   */
  @Json(name = "renameRename")
  RENAME_RENAME
}
