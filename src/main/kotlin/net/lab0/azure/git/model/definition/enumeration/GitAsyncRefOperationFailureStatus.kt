package net.lab0.azure.git.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Provides a status code that indicates the reason the cherry pick or revert failed.
 */
enum class GitAsyncRefOperationFailureStatus {
  /**
   * No status
   */
  @Json(name = "none")
  NONE,

  /**
   * Indicates that the ref update request could not be completed because the ref name presented in
   * the request was not valid.
   */
  @Json(name = "invalidRefName")
  INVALID_REF_NAME,

  /**
   * The ref update could not be completed because, in case-insensitive mode, the ref name conflicts
   * with an existing, differently-cased ref name.
   */
  @Json(name = "refNameConflict")
  REF_NAME_CONFLICT,

  /**
   * The ref update request could not be completed because the user lacks the permission to create a
   * branch
   */
  @Json(name = "createBranchPermissionRequired")
  CREATE_BRANCH_PERMISSION_REQUIRED,

  /**
   * The ref update request could not be completed because the user lacks write permissions required
   * to write this ref
   */
  @Json(name = "writePermissionRequired")
  WRITE_PERMISSION_REQUIRED,

  /**
   * Target branch was deleted after Git async operation started
   */
  @Json(name = "targetBranchDeleted")
  TARGET_BRANCH_DELETED,

  /**
   * Git object is too large to materialize into memory
   */
  @Json(name = "gitObjectTooLarge")
  GIT_OBJECT_TOO_LARGE,

  /**
   * Identity who authorized the operation was not found
   */
  @Json(name = "operationIndentityNotFound")
  OPERATION_INDENTITY_NOT_FOUND,

  /**
   * Async operation was not found
   */
  @Json(name = "asyncOperationNotFound")
  ASYNC_OPERATION_NOT_FOUND,

  /**
   * Unexpected failure
   */
  @Json(name = "other")
  OTHER,

  /**
   * Initiator of async operation has signature with empty name or email
   */
  @Json(name = "emptyCommitterSignature")
  EMPTY_COMMITTER_SIGNATURE
}
