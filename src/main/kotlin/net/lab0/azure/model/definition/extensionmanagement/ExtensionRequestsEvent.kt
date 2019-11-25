package net.lab0.azure.model.definition.extensionmanagement

import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.extensionmanagement.ExtensionRequestUpdateType

interface ExtensionRequestsEvent {
  val extension: PublishedExtension

  val host: ExtensionHost

  val links: ExtensionRequestUrls

  /**
   * The extension request object
   */
  val requests: List<ExtensionRequest>

  /**
   * The type of update that was made
   */
  val updateType: ExtensionRequestUpdateType
}
