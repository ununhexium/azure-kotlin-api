package net.lab0.azure.model.definition.enumeration.extensionmanagement

import com.squareup.moshi.Json

enum class ExtensionVersionFlags {
  /**
   * No flags exist for this version.
   */
  @Json(name = "none")
  NONE,

  /**
   * The Validated flag for a version means the extension version has passed validation and can be
   * used..
   */
  @Json(name = "validated")
  VALIDATED
}
