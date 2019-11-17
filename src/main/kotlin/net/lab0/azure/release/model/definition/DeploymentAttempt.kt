package net.lab0.azure.release.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.release.model.definition.enumeration.DeploymentOperationStatus
import net.lab0.azure.release.model.definition.enumeration.DeploymentReason
import net.lab0.azure.release.model.definition.enumeration.DeploymentStatus

interface DeploymentAttempt {
  val attempt: Int

  val deploymentId: Int

  /**
   * Specifies whether deployment has started or not
   */
  val hasStarted: Boolean

  val id: Int

  /**
   * All the issues related to the deployment
   */
  val issues: List<Issue>

  val job: ReleaseTask

  val lastModifiedBy: IdentityRef

  val lastModifiedOn: String

  val operationStatus: DeploymentOperationStatus

  val postDeploymentGates: ReleaseGates

  val preDeploymentGates: ReleaseGates

  val queuedOn: String

  val reason: DeploymentReason

  val releaseDeployPhases: List<ReleaseDeployPhase>

  val requestedBy: IdentityRef

  val requestedFor: IdentityRef

  val runPlanId: String

  val status: DeploymentStatus

  val tasks: List<ReleaseTask>
}
