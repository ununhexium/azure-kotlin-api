package net.lab0.azure.model.definition.enumeration.git

import com.squareup.moshi.Json

/**
 * Status of the update on the server
 */
enum class GitConflictUpdateStatus {
  /**
   * Indicates that pull request conflict update request was completed successfully
   */
  @Json(name = "succeeded")
  SUCCEEDED,

  /**
   * Indicates that the update request did not fit the expected data contract
   */
  @Json(name = "badRequest")
  BAD_REQUEST,

  /**
   * Indicates that the requested resolution was not valid
   */
  @Json(name = "invalidResolution")
  INVALID_RESOLUTION,

  /**
   * Indicates that the conflict in the update request was not a supported conflict type
   */
  @Json(name = "unsupportedConflictType")
  UNSUPPORTED_CONFLICT_TYPE,

  /**
   * Indicates that the conflict could not be found
   */
  @Json(name = "notFound")
  NOT_FOUND
}
