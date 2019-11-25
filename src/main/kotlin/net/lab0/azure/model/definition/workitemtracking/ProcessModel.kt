package net.lab0.azure.model.definition.workitemtracking

import kotlin.String
import kotlin.collections.List

interface ProcessModel {
  /**
   * Description of the process
   */
  val description: String

  /**
   * Name of the process
   */
  val name: String

  /**
   * Projects in this process
   */
  val projects: List<ProjectReference>

  val properties: ProcessProperties

  /**
   * Reference name of the process
   */
  val referenceName: String

  /**
   * The ID of the process
   */
  val typeId: String
}
