package net.lab0.azure.extensionmanagement.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Represents the state of the request
 */
enum class ExtensionRequestState {
  /**
   * The request has been opened, but not yet responded to
   */
  @Json(name = "open")
  OPEN,

  /**
   * The request was accepted (extension installed or license assigned)
   */
  @Json(name = "accepted")
  ACCEPTED,

  /**
   * The request was rejected (extension not installed or license not assigned)
   */
  @Json(name = "rejected")
  REJECTED
}
