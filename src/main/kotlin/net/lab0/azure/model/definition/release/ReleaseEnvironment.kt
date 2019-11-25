package net.lab0.azure.model.definition.release

import javax.json.JsonNumber
import javax.json.JsonObject
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.release.EnvironmentStatus

interface ReleaseEnvironment {
  /**
   * Gets list of conditions.
   */
  val conditions: List<ReleaseCondition>

  /**
   * Gets date on which it got created.
   */
  val createdOn: String

  /**
   * Gets definition environment id.
   */
  val definitionEnvironmentId: Int

  /**
   * Gets demands.
   */
  val demands: List<Demand>

  /**
   * Gets list of deploy phases snapshot.
   */
  val deployPhasesSnapshot: List<DeployPhase>

  /**
   * Gets deploy steps.
   */
  val deploySteps: List<DeploymentAttempt>

  val environmentOptions: EnvironmentOptions

  /**
   * Gets the unique identifier of this field.
   */
  val id: Int

  /**
   * Gets date on which it got modified.
   */
  val modifiedOn: String

  /**
   * Gets name.
   */
  val name: String

  /**
   * Gets next scheduled UTC time.
   */
  val nextScheduledUtcTime: String

  val owner: IdentityRef

  val postApprovalsSnapshot: ReleaseDefinitionApprovals

  /**
   * Gets list of post deploy approvals.
   */
  val postDeployApprovals: List<ReleaseApproval>

  val postDeploymentGatesSnapshot: ReleaseDefinitionGatesStep

  val preApprovalsSnapshot: ReleaseDefinitionApprovals

  /**
   * Gets list of pre deploy approvals.
   */
  val preDeployApprovals: List<ReleaseApproval>

  val preDeploymentGatesSnapshot: ReleaseDefinitionGatesStep

  val processParameters: ProcessParameters

  /**
   * Gets queue id.
   */
  val queueId: Int

  /**
   * Gets rank.
   */
  val rank: Int

  val release: ReleaseShallowReference

  val releaseCreatedBy: IdentityRef

  val releaseDefinition: ReleaseDefinitionShallowReference

  /**
   * Gets release description.
   */
  val releaseDescription: String

  /**
   * Gets release id.
   */
  val releaseId: Int

  /**
   * Gets schedule deployment time of release environment.
   */
  val scheduledDeploymentTime: String

  /**
   * Gets list of schedules.
   */
  val schedules: List<ReleaseSchedule>

  /**
   * Gets environment status.
   */
  val status: EnvironmentStatus

  /**
   * Gets time to deploy.
   */
  val timeToDeploy: JsonNumber

  /**
   * Gets trigger reason.
   */
  val triggerReason: String

  /**
   * Gets the list of variable groups.
   */
  val variableGroups: List<VariableGroup>

  /**
   * Gets the dictionary of variables.
   */
  val variables: JsonObject

  /**
   * Gets list of workflow tasks.
   */
  val workflowTasks: List<WorkflowTask>
}
