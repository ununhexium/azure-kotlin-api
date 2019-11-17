package net.lab0.azure.cloudloadtest.model.definition

import kotlin.Int
import net.lab0.azure.cloudloadtest.model.definition.enumeration.LoadTestMachineType

interface LoadTestRunSettings {
  val agentCount: Int

  val coreCount: Int

  val coresPerAgent: Int

  val duration: Int

  val loadGeneratorMachinesType: LoadTestMachineType

  val samplingInterval: Int

  val warmUpDuration: Int
}
