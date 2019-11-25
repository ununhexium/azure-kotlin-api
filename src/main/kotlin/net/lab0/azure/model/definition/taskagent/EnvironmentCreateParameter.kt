package net.lab0.azure.model.definition.taskagent

import kotlin.String

/**
 * Properties to create Environment.
 */
interface EnvironmentCreateParameter {
  /**
   * Description of the environment.
   */
  val description: String

  /**
   * Name of the environment.
   */
  val name: String
}
