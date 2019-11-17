package net.lab0.azure.git.model.definition.enumeration

import com.squareup.moshi.Json

enum class GitResolutionError {
  /**
   * No error
   */
  @Json(name = "none")
  NONE,

  /**
   * User set a blob id for resolving a content merge, but blob was not found in repo during
   * application
   */
  @Json(name = "mergeContentNotFound")
  MERGE_CONTENT_NOT_FOUND,

  /**
   * Attempted to resolve a conflict by moving a file to another path, but path was already in use
   */
  @Json(name = "pathInUse")
  PATH_IN_USE,

  /**
   * No error
   */
  @Json(name = "invalidPath")
  INVALID_PATH,

  /**
   * GitResolutionAction was set to an unrecognized value
   */
  @Json(name = "unknownAction")
  UNKNOWN_ACTION,

  /**
   * GitResolutionMergeType was set to an unrecognized value
   */
  @Json(name = "unknownMergeType")
  UNKNOWN_MERGE_TYPE,

  /**
   * Any error for which a more specific code doesn't apply
   */
  @Json(name = "otherError")
  OTHER_ERROR
}
