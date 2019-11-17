package net.lab0.azure.release.model.definition

interface ServerDeploymentInput : BaseDeploymentInput {
  val parallelExecution: ExecutionInput
}
