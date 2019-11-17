package net.lab0.azure.release.model.definition

interface GatesDeployPhase : DeployPhase {
  val deploymentInput: GatesDeploymentInput
}
