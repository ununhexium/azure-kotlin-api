package net.lab0.azure.release.model.definition

import kotlin.Int

interface GatesDeploymentInput : BaseDeploymentInput {
  val minimumSuccessDuration: Int

  val samplingInterval: Int

  val stabilizationTime: Int
}
