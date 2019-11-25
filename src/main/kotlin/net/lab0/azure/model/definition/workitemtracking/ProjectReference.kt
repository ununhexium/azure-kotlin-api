package net.lab0.azure.model.definition.workitemtracking

import kotlin.String

interface ProjectReference {
  /**
   * Description of the project
   */
  val description: String

  /**
   * The ID of the project
   */
  val id: String

  /**
   * Name of the project
   */
  val name: String

  /**
   * Url of the project
   */
  val url: String
}
