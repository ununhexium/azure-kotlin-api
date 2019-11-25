package net.lab0.azure.model.definition.release

interface RunOnServerDeployPhase : DeployPhase {
  val deploymentInput: ServerDeploymentInput
}
