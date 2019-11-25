package net.lab0.azure.model.definition.release

import kotlin.Int

interface AgentDeploymentInput : DeploymentInput {
  val imageId: Int

  val parallelExecution: ExecutionInput
}
