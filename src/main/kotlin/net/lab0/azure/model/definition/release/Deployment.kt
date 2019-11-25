package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.release.DeploymentOperationStatus
import net.lab0.azure.model.definition.enumeration.release.DeploymentReason
import net.lab0.azure.model.definition.enumeration.release.DeploymentStatus

interface Deployment {
  /**
   * Gets attempt number.
   */
  val attempt: Int

  /**
   * Gets the date on which deployment is complete.
   */
  val completedOn: String

  /**
   * Gets the list of condition associated with deployment.
   */
  val conditions: List<Condition>

  /**
   * Gets release definition environment id.
   */
  val definitionEnvironmentId: Int

  /**
   * Gets status of the deployment.
   */
  val deploymentStatus: DeploymentStatus

  /**
   * Gets the unique identifier for deployment.
   */
  val id: Int

  val lastModifiedBy: IdentityRef

  /**
   * Gets the date on which deployment is last modified.
   */
  val lastModifiedOn: String

  /**
   * Gets operation status of deployment.
   */
  val operationStatus: DeploymentOperationStatus

  /**
   * Gets list of PostDeployApprovals.
   */
  val postDeployApprovals: List<ReleaseApproval>

  /**
   * Gets list of PreDeployApprovals.
   */
  val preDeployApprovals: List<ReleaseApproval>

  val projectReference: ProjectReference

  /**
   * Gets the date on which deployment is queued.
   */
  val queuedOn: String

  /**
   * Gets reason of deployment.
   */
  val reason: DeploymentReason

  val release: ReleaseReference

  val releaseDefinition: ReleaseDefinitionShallowReference

  val releaseEnvironment: ReleaseEnvironmentShallowReference

  val requestedBy: IdentityRef

  val requestedFor: IdentityRef

  /**
   * Gets the date on which deployment is scheduled.
   */
  val scheduledDeploymentTime: String

  /**
   * Gets the date on which deployment is started.
   */
  val startedOn: String
}
