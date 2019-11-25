package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.release.DeployPhaseStatus
import net.lab0.azure.model.definition.enumeration.release.DeployPhaseTypes

interface ReleaseDeployPhase {
  val deploymentJobs: List<DeploymentJob>

  val errorLog: String

  val id: Int

  val manualInterventions: List<ManualIntervention>

  val name: String

  val phaseId: String

  val phaseType: DeployPhaseTypes

  val rank: Int

  val runPlanId: String

  /**
   * Phase start time
   */
  val startedOn: String

  val status: DeployPhaseStatus
}
