package net.lab0.azure.model.definition.taskagent

import kotlin.collections.List

interface DeploymentMachinesChangeEvent {
  val machineGroupReference: DeploymentGroupReference

  val machines: List<DeploymentMachineChangedData>
}
