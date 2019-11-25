package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import kotlin.String

/**
 * Deployment group reference. This is useful for referring a deployment group in another object.
 */
interface DeploymentGroupReference {
  /**
   * Deployment group identifier.
   */
  val id: Int

  /**
   * Name of the deployment group.
   */
  val name: String

  val pool: TaskAgentPoolReference

  val project: ProjectReference
}
