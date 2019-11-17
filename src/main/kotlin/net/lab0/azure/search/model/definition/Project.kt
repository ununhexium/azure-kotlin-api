package net.lab0.azure.search.model.definition

import kotlin.String

/**
 * Defines the details of the project.
 */
interface Project {
  /**
   * Id of the project.
   */
  val id: String

  /**
   * Name of the project.
   */
  val name: String
}
