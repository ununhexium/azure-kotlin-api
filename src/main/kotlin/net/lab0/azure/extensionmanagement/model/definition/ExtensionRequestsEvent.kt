package net.lab0.azure.extensionmanagement.model.definition

import kotlin.collections.List
import net.lab0.azure.extensionmanagement.model.definition.enumeration.ExtensionRequestUpdateType

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
