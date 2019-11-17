package net.lab0.azure.extensionmanagement.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The type of update that was made
 */
enum class ExtensionUpdateType {
  @Json(name = "installed")
  INSTALLED,

  @Json(name = "uninstalled")
  UNINSTALLED,

  @Json(name = "enabled")
  ENABLED,

  @Json(name = "disabled")
  DISABLED,

  @Json(name = "versionUpdated")
  VERSION_UPDATED,

  @Json(name = "actionRequired")
  ACTION_REQUIRED,

  @Json(name = "actionResolved")
  ACTION_RESOLVED
}
