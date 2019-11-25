package net.lab0.azure.model.definition.cloudloadtest

import kotlin.Int
import net.lab0.azure.model.definition.enumeration.cloudloadtest.LoadTestMachineType

interface LoadTestRunSettings {
  val agentCount: Int

  val coreCount: Int

  val coresPerAgent: Int

  val duration: Int

  val loadGeneratorMachinesType: LoadTestMachineType

  val samplingInterval: Int

  val warmUpDuration: Int
}
