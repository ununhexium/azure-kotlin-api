package net.lab0.azure.model.definition.cloudloadtest

import net.lab0.azure.model.definition.enumeration.cloudloadtest.LoadTestMachineType

interface OverridableRunSettings {
  val loadGeneratorMachinesType: LoadTestMachineType

  val staticAgentRunSettings: StaticAgentRunSetting
}
