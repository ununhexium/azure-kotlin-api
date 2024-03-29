package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String
import net.lab0.azure.model.definition.enumeration.extensionmanagement.ExtensionRequestUpdateType

interface ExtensionRequestEvent {
  val extension: PublishedExtension

  val host: ExtensionHost

  /**
   * Name of the collection for which the extension was requested
   */
  val hostName: String

  val links: ExtensionRequestUrls

  val request: ExtensionRequest

  /**
   * The type of update that was made
   */
  val updateType: ExtensionRequestUpdateType
}
