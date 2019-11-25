package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String

interface ExtensionUrls {
  /**
   * Url of the extension icon
   */
  val extensionIcon: String

  /**
   * Link to view the extension details page
   */
  val extensionPage: String
}
