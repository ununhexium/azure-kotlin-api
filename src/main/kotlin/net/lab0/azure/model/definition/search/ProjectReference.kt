package net.lab0.azure.model.definition.search

import kotlin.String

/**
 * Defines the details of the project.
 */
interface ProjectReference {
  /**
   * ID of the project.
   */
  val id: String

  /**
   * Name of the project.
   */
  val name: String

  /**
   * Visibility of the project.
   */
  val visibility: String
}
