package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import kotlin.String

/**
 * Properties to create Deployment group.
 */
interface DeploymentGroupCreateParameter {
  /**
   * Description of the deployment group.
   */
  val description: String

  /**
   * Name of the deployment group.
   */
  val name: String

  /**
   * Identifier of the deployment pool in which deployment agents are registered.
   */
  val poolId: Int
}
