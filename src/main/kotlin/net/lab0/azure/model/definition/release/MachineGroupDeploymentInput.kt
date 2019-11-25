package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface MachineGroupDeploymentInput : DeploymentInput {
  val deploymentHealthOption: String

  val healthPercent: Int

  val tags: List<String>
}
