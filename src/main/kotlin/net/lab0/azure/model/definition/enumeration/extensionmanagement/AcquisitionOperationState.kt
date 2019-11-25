package net.lab0.azure.model.definition.enumeration.extensionmanagement

import com.squareup.moshi.Json

/**
 * State of the the AcquisitionOperation for the current user
 */
enum class AcquisitionOperationState {
  /**
   * Not allowed to use this AcquisitionOperation
   */
  @Json(name = "disallow")
  DISALLOW,

  /**
   * Allowed to use this AcquisitionOperation
   */
  @Json(name = "allow")
  ALLOW,

  /**
   * Operation has already been completed and is no longer available
   */
  @Json(name = "completed")
  COMPLETED
}
