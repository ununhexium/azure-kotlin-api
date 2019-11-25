package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String
import net.lab0.azure.model.definition.enumeration.extensionmanagement.ExtensionUpdateType

interface ExtensionEvent {
  val extension: PublishedExtension

  /**
   * The current version of the extension that was updated
   */
  val extensionVersion: String

  val host: ExtensionHost

  val links: ExtensionEventUrls

  val modifiedBy: IdentityRef

  /**
   * The type of update that was made
   */
  val updateType: ExtensionUpdateType
}
