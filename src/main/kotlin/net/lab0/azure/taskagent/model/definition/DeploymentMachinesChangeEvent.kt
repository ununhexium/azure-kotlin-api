package net.lab0.azure.taskagent.model.definition

import kotlin.collections.List

interface DeploymentMachinesChangeEvent {
  val machineGroupReference: DeploymentGroupReference

  val machines: List<DeploymentMachineChangedData>
}
