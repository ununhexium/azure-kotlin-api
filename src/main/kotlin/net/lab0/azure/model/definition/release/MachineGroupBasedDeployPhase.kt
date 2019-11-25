package net.lab0.azure.model.definition.release

interface MachineGroupBasedDeployPhase : DeployPhase {
  val deploymentInput: MachineGroupDeploymentInput
}
