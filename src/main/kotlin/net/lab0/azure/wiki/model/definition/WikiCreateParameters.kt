package net.lab0.azure.wiki.model.definition

import kotlin.String

/**
 * Wiki creations parameters.
 */
interface WikiCreateParameters {
  /**
   * Wiki name.
   */
  val name: String

  /**
   * ID of the project in which the wiki is to be created.
   */
  val projectId: String
}
