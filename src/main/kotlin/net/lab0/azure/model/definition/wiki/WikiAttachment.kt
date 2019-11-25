package net.lab0.azure.model.definition.wiki

import kotlin.String

/**
 * Defines properties for wiki attachment file.
 */
interface WikiAttachment {
  /**
   * Name of the wiki attachment file.
   */
  val name: String

  /**
   * Path of the wiki attachment file.
   */
  val path: String
}
