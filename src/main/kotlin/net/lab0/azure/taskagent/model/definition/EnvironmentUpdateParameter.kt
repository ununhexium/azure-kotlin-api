package net.lab0.azure.taskagent.model.definition

import kotlin.String

/**
 * Properties to update Environment.
 */
interface EnvironmentUpdateParameter {
  /**
   * Description of the environment.
   */
  val description: String

  /**
   * Name of the environment.
   */
  val name: String
}
