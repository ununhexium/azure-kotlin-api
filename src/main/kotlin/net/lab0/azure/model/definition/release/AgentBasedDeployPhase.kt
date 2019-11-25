package net.lab0.azure.model.definition.release

interface AgentBasedDeployPhase : DeployPhase {
  val deploymentInput: AgentDeploymentInput
}
