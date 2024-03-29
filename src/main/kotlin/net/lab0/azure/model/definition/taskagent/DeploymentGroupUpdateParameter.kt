package net.lab0.azure.model.definition.taskagent

import kotlin.String

/**
 * Deployment group update parameter.
 */
interface DeploymentGroupUpdateParameter {
  /**
   * Description of the deployment group.
   */
  val description: String

  /**
   * Name of the deployment group.
   */
  val name: String
}
