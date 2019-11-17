package net.lab0.azure.extensionmanagement.model.definition

import kotlin.String

interface ExtensionRequestUrls : ExtensionUrls {
  /**
   * Link to view the extension request
   */
  val requestPage: String
}
