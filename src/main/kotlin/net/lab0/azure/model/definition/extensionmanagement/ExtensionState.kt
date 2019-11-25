package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String

/**
 * The state of an extension
 */
interface ExtensionState : InstalledExtensionState {
  val extensionName: String

  /**
   * The time at which the version was last checked
   */
  val lastVersionCheck: String

  val publisherName: String

  val version: String
}
