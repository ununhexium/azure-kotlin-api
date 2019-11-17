package net.lab0.azure.release.model.definition

interface AgentBasedDeployPhase : DeployPhase {
  val deploymentInput: AgentDeploymentInput
}
