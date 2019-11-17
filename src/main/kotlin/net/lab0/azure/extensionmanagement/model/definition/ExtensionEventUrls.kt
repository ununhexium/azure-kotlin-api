package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String

interface ExtensionEventUrls : ExtensionUrls {
  /**
   * Url of the extension management page
   */
  val manageExtensionsPage: String
}
