package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Deployment group.
 */
interface DeploymentGroup : DeploymentGroupReference {
  /**
   * Description of the deployment group.
   */
  val description: String

  /**
   * Number of deployment targets in the deployment group.
   */
  val machineCount: Int

  /**
   * List of deployment targets in the deployment group.
   */
  val machines: List<DeploymentMachine>

  /**
   * List of unique tags across all deployment targets in the deployment group.
   */
  val machineTags: List<String>
}
