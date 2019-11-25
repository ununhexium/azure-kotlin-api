package net.lab0.azure.model.definition.enumeration.extensionmanagement

import com.squareup.moshi.Json

/**
 * Extension flags relevant to contribution consumers
 */
enum class ExtensionFlags {
  /**
   * A built-in extension is installed for all VSTS accounts by default
   */
  @Json(name = "builtIn")
  BUILT_IN,

  /**
   * The extension comes from a fully-trusted publisher
   */
  @Json(name = "trusted")
  TRUSTED
}
