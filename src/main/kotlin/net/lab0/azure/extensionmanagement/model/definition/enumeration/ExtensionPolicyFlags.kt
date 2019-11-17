package net.lab0.azure.extensionmanagement.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * Permissions on 'Install' operation
 */
enum class ExtensionPolicyFlags {
  /**
   * No permission
   */
  @Json(name = "none")
  NONE,

  /**
   * Permission on private extensions
   */
  @Json(name = "private")
  PRIVATE,

  /**
   * Permission on public extensions
   */
  @Json(name = "public")
  PUBLIC,

  /**
   * Premission in extensions that are in preview
   */
  @Json(name = "preview")
  PREVIEW,

  /**
   * Premission in relased extensions
   */
  @Json(name = "released")
  RELEASED,

  /**
   * Permission in 1st party extensions
   */
  @Json(name = "firstParty")
  FIRST_PARTY,

  /**
   * Mask that defines all permissions
   */
  @Json(name = "all")
  ALL
}
