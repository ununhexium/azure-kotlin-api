package net.lab0.azure.search.model.definition

import kotlin.String

/**
 * Defines the details of wiki.
 */
interface Wiki {
  /**
   * Id of the wiki.
   */
  val id: String

  /**
   * Mapped path for the wiki.
   */
  val mappedPath: String

  /**
   * Name of the wiki.
   */
  val name: String

  /**
   * Version for wiki.
   */
  val version: String
}
