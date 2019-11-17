package net.lab0.azure.cloudloadtest.model.definition

import kotlin.String
import net.lab0.azure.cloudloadtest.model.definition.enumeration.LoadTestMachineType

interface StaticAgentRunSetting {
  val loadGeneratorMachinesType: LoadTestMachineType

  val staticAgentGroupName: String
}
