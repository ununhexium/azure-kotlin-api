package net.lab0.azure.model.definition.release

import kotlin.Int

interface GatesDeploymentInput : BaseDeploymentInput {
  val minimumSuccessDuration: Int

  val samplingInterval: Int

  val stabilizationTime: Int
}
