package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String

/**
 * Information about the extension
 */
interface SupportedExtension {
  /**
   * Unique Identifier for this extension
   */
  val extension: String

  /**
   * Unique Identifier for this publisher
   */
  val publisher: String

  /**
   * Supported version for this extension
   */
  val version: String
}
