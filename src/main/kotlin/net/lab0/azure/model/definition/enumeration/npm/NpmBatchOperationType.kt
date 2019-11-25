package net.lab0.azure.model.definition.enumeration.npm

import com.squareup.moshi.Json

/**
 * Type of operation that needs to be performed on packages.
 */
enum class NpmBatchOperationType {
  /**
   * Promote package versions to a release view. If constructing a NpmPackagesBatchRequest object
   * with this type, use BatchPromoteData for its Data property. Not supported in the Recycle Bin.
   */
  @Json(name = "promote")
  PROMOTE,

  /**
   * Deprecate or undeprecate package versions. Not supported in the Recycle Bin.
   */
  @Json(name = "deprecate")
  DEPRECATE,

  /**
   * Unpublish package versions. Npm-specific alias for the Delete operation. Not supported in the
   * Recycle Bin.
   */
  @Json(name = "unpublish")
  UNPUBLISH,

  /**
   * Permanently delete package versions. Only supported in the Recycle Bin.
   */
  @Json(name = "permanentDelete")
  PERMANENT_DELETE,

  /**
   * Restore unpublished package versions to the feed. Only supported in the Recycle Bin.
   */
  @Json(name = "restoreToFeed")
  RESTORE_TO_FEED,

  /**
   * Delete package versions (equivalent to Unpublish). Not supported in the Recycle Bin.
   */
  @Json(name = "delete")
  DELETE
}
