package net.lab0.azure.cloudloadtest.model.definition

import net.lab0.azure.cloudloadtest.model.definition.enumeration.LoadTestMachineType

interface OverridableRunSettings {
  val loadGeneratorMachinesType: LoadTestMachineType

  val staticAgentRunSettings: StaticAgentRunSetting
}
