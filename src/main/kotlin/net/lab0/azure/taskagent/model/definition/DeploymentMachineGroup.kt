package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.collections.List

interface DeploymentMachineGroup : DeploymentMachineGroupReference {
  val machines: List<DeploymentMachine>

  val size: Int
}
