package net.lab0.azure.workitemtracking.model.definition

import kotlin.String

interface CreateProcessModel {
  /**
   * Description of the process
   */
  val description: String

  /**
   * Name of the process
   */
  val name: String

  /**
   * The ID of the parent process
   */
  val parentProcessTypeId: String

  /**
   * Reference name of the process
   */
  val referenceName: String
}
