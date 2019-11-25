package net.lab0.azure.model.definition.enumeration.extensionmanagement

import com.squareup.moshi.Json

/**
 * How the item is being assigned
 */
enum class AcquisitionAssignmentType {
  @Json(name = "none")
  NONE,

  /**
   * Just assign for me
   */
  @Json(name = "me")
  ME,

  /**
   * Assign for all users in the account
   */
  @Json(name = "all")
  ALL
}
