package net.lab0.azure.workitemtracking.model.definition

import kotlin.Boolean
import kotlin.String

/**
 * Describes a request to update a process
 */
interface UpdateProcessModel {
  /**
   * New description of the process
   */
  val description: String

  /**
   * If true new projects will use this process by default
   */
  val isDefault: Boolean

  /**
   * If false the process will be disabled and cannot be used to create projects
   */
  val isEnabled: Boolean

  /**
   * New name of the process
   */
  val name: String
}
