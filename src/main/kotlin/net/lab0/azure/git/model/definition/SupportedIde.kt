package net.lab0.azure.git.model.definition

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.git.model.definition.enumeration.SupportedIdeType

/**
 * Represents a Supported IDE entity.
 */
interface SupportedIde {
  /**
   * The download URL for the IDE.
   */
  val downloadUrl: String

  /**
   * The type of the IDE.
   */
  val ideType: SupportedIdeType

  /**
   * The name of the IDE.
   */
  val name: String

  /**
   * The URL to open the protocol handler for the IDE.
   */
  val protocolHandlerUrl: String

  /**
   * A list of SupportedPlatforms.
   */
  val supportedPlatforms: List<String>
}
