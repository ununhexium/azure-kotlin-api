package net.lab0.azure.model.definition.enumeration.extensionmanagement

import com.squareup.moshi.Json

/**
 * Installation issue type (Warning, Error)
 */
enum class InstalledExtensionStateIssueType {
  /**
   * Represents an installation warning, for example an implicit demand not supported
   */
  @Json(name = "warning")
  WARNING,

  /**
   * Represents an installation error, for example an explicit demand not supported
   */
  @Json(name = "error")
  ERROR
}
