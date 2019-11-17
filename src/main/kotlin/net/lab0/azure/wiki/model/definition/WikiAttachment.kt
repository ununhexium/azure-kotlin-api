package net.lab0.azure.wiki.model.definition

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
