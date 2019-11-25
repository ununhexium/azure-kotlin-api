package net.lab0.azure.model.definition.extensionmanagement

import kotlin.String

/**
 * Base class for an event callback for an extension
 */
interface ExtensionEventCallback {
  /**
   * The uri of the endpoint that is hit when an event occurs
   */
  val uri: String
}
