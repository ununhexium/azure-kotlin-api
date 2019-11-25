package net.lab0.azure.model.definition.release

import kotlin.String

interface ProjectReference {
  /**
   * Gets the unique identifier of this field.
   */
  val id: String

  /**
   * Gets name of project.
   */
  val name: String
}
