package net.lab0.azure.model.definition.cloudloadtest

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.cloudloadtest.LoadTestMachineType

interface WebApiLoadTestMachineInput {
  val machineGroupId: String

  val machineType: LoadTestMachineType

  val setupConfiguration: WebApiSetupParamaters

  val supportedRunTypes: List<JsonObject>
}
