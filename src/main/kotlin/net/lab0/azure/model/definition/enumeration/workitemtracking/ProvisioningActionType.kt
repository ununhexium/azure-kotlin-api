package net.lab0.azure.model.definition.enumeration.workitemtracking

import com.squareup.moshi.Json

/**
 * Describes the type of the action for the update request.
 */
enum class ProvisioningActionType {
  @Json(name = "import")
  IMPORT,

  @Json(name = "validate")
  VALIDATE
}
