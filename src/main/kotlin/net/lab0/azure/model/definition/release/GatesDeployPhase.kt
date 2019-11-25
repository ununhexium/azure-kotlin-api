package net.lab0.azure.model.definition.release

interface GatesDeployPhase : DeployPhase {
  val deploymentInput: GatesDeploymentInput
}
