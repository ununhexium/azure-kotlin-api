package net.lab0.azure.model.definition.cloudloadtest

import kotlin.String
import net.lab0.azure.model.definition.enumeration.cloudloadtest.LoadTestMachineType

interface StaticAgentRunSetting {
  val loadGeneratorMachinesType: LoadTestMachineType

  val staticAgentGroupName: String
}
