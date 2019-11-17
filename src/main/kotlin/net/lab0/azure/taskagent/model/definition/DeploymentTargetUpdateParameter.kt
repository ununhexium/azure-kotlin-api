package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Deployment target update parameter.
 */
interface DeploymentTargetUpdateParameter {
  /**
   * Identifier of the deployment target.
   */
  val id: Int

  val tags: List<String>
}
