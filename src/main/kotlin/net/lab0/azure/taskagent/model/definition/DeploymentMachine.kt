package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Deployment target.
 */
interface DeploymentMachine {
  val agent: TaskAgent

  /**
   * Deployment target Identifier.
   */
  val id: Int

  /**
   * Tags of the deployment target.
   */
  val tags: List<String>
}
