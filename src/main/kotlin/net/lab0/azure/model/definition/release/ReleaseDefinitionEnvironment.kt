package net.lab0.azure.model.definition.release

import javax.json.JsonObject
import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface ReleaseDefinitionEnvironment {
  val badgeUrl: String

  val conditions: List<Condition>

  val currentRelease: ReleaseShallowReference

  val demands: List<Demand>

  val deployPhases: List<DeployPhase>

  val deployStep: ReleaseDefinitionDeployStep

  val environmentOptions: EnvironmentOptions

  val environmentTriggers: List<EnvironmentTrigger>

  val executionPolicy: EnvironmentExecutionPolicy

  val id: Int

  val name: String

  val owner: IdentityRef

  val postDeployApprovals: ReleaseDefinitionApprovals

  val postDeploymentGates: ReleaseDefinitionGatesStep

  val preDeployApprovals: ReleaseDefinitionApprovals

  val preDeploymentGates: ReleaseDefinitionGatesStep

  val processParameters: ProcessParameters

  val properties: PropertiesCollection

  val queueId: Int

  val rank: Int

  val retentionPolicy: EnvironmentRetentionPolicy

  val schedules: List<ReleaseSchedule>

  val variableGroups: List<Int>

  val variables: JsonObject
}
