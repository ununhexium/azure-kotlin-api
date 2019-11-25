package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.release.DeployPhaseTypes

interface DeployPhase {
  val name: String

  val phaseType: DeployPhaseTypes

  val rank: Int

  val refName: String

  val workflowTasks: List<WorkflowTask>
}
