package net.lab0.azure.cloudloadtest.model.definition

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.cloudloadtest.model.definition.enumeration.LoadTestMachineType

interface WebApiLoadTestMachineInput {
  val machineGroupId: String

  val machineType: LoadTestMachineType

  val setupConfiguration: WebApiSetupParamaters

  val supportedRunTypes: List<JsonObject>
}
