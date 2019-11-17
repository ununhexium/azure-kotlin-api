package net.lab0.azure.release.model.definition

interface MachineGroupBasedDeployPhase : DeployPhase {
  val deploymentInput: MachineGroupDeploymentInput
}
