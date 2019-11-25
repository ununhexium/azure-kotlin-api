package net.lab0.azure.model.definition.enumeration.extensionmanagement

import com.squareup.moshi.Json

/**
 * The type of update that was made
 */
enum class ExtensionRequestUpdateType {
  @Json(name = "created")
  CREATED,

  @Json(name = "approved")
  APPROVED,

  @Json(name = "rejected")
  REJECTED,

  @Json(name = "deleted")
  DELETED
}
