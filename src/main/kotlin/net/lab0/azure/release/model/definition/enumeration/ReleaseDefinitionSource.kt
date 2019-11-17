package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Gets or sets source of release definition.
 */
enum class ReleaseDefinitionSource {
  @Json(name = "undefined")
  UNDEFINED,

  @Json(name = "restApi")
  REST_API,

  @Json(name = "userInterface")
  USER_INTERFACE,

  @Json(name = "ibiza")
  IBIZA,

  @Json(name = "portalExtensionApi")
  PORTAL_EXTENSION_API
}
