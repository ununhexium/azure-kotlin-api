package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String

interface ExtensionRequestUrls : ExtensionUrls {
  /**
   * Link to view the extension request
   */
  val requestPage: String
}
