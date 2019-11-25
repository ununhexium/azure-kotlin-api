package net.lab0.azure.model.definition.release

interface ServerDeploymentInput : BaseDeploymentInput {
  val parallelExecution: ExecutionInput
}
