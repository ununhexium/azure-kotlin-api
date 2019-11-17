package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.collections.List

/**
 * Deployment pool summary.
 */
interface DeploymentPoolSummary {
  /**
   * List of deployment groups referring to the deployment pool.
   */
  val deploymentGroups: List<DeploymentGroupReference>

  /**
   * Number of deployment agents that are offline.
   */
  val offlineAgentsCount: Int

  /**
   * Number of deployment agents that are online.
   */
  val onlineAgentsCount: Int

  val pool: TaskAgentPoolReference
}
