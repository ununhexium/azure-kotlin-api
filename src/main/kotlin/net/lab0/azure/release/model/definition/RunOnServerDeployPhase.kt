package net.lab0.azure.release.model.definition

interface RunOnServerDeployPhase : DeployPhase {
  val deploymentInput: ServerDeploymentInput
}
