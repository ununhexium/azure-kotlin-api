package net.lab0.azure.git.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Status of the update from the TFS server.
 */
enum class GitRefUpdateStatus {
  /**
   * Indicates that the ref update request was completed successfully.
   */
  @Json(name = "succeeded")
  SUCCEEDED,

  /**
   * Indicates that the ref update request could not be completed because part of the graph would be
   * disconnected by this change, and the caller does not have ForcePush permission on the repository.
   */
  @Json(name = "forcePushRequired")
  FORCE_PUSH_REQUIRED,

  /**
   * Indicates that the ref update request could not be completed because the old object ID
   * presented in the request was not the object ID of the ref when the database attempted the update.
   * The most likely scenario is that the caller lost a race to update the ref.
   */
  @Json(name = "staleOldObjectId")
  STALE_OLD_OBJECT_ID,

  /**
   * Indicates that the ref update request could not be completed because the ref name presented in
   * the request was not valid.
   */
  @Json(name = "invalidRefName")
  INVALID_REF_NAME,

  /**
   * The request was not processed
   */
  @Json(name = "unprocessed")
  UNPROCESSED,

  /**
   * The ref update request could not be completed because the new object ID for the ref could not
   * be resolved to a commit object (potentially through any number of tags)
   */
  @Json(name = "unresolvableToCommit")
  UNRESOLVABLE_TO_COMMIT,

  /**
   * The ref update request could not be completed because the user lacks write permissions required
   * to write this ref
   */
  @Json(name = "writePermissionRequired")
  WRITE_PERMISSION_REQUIRED,

  /**
   * The ref update request could not be completed because the user lacks note creation permissions
   * required to write this note
   */
  @Json(name = "manageNotePermissionRequired")
  MANAGE_NOTE_PERMISSION_REQUIRED,

  /**
   * The ref update request could not be completed because the user lacks the permission to create a
   * branch
   */
  @Json(name = "createBranchPermissionRequired")
  CREATE_BRANCH_PERMISSION_REQUIRED,

  /**
   * The ref update request could not be completed because the user lacks the permission to create a
   * tag
   */
  @Json(name = "createTagPermissionRequired")
  CREATE_TAG_PERMISSION_REQUIRED,

  /**
   * The ref update could not be completed because it was rejected by the plugin.
   */
  @Json(name = "rejectedByPlugin")
  REJECTED_BY_PLUGIN,

  /**
   * The ref update could not be completed because the ref is locked by another user.
   */
  @Json(name = "locked")
  LOCKED,

  /**
   * The ref update could not be completed because, in case-insensitive mode, the ref name conflicts
   * with an existing, differently-cased ref name.
   */
  @Json(name = "refNameConflict")
  REF_NAME_CONFLICT,

  /**
   * The ref update could not be completed because it was rejected by policy.
   */
  @Json(name = "rejectedByPolicy")
  REJECTED_BY_POLICY,

  /**
   * Indicates that the ref update request was completed successfully, but the ref doesn't actually
   * exist so no changes were made.  This should only happen during deletes.
   */
  @Json(name = "succeededNonExistentRef")
  SUCCEEDED_NON_EXISTENT_REF,

  /**
   * Indicates that the ref update request was completed successfully, but the passed-in ref was
   * corrupt - as in, the old object ID was bad.  This should only happen during deletes.
   */
  @Json(name = "succeededCorruptRef")
  SUCCEEDED_CORRUPT_REF
}
