package net.lab0.azure.cloudloadtest.model.definition

import kotlin.String
import kotlin.collections.List

interface TenantDetails {
  val accessDetails: List<AgentGroupAccessData>

  val id: String

  val staticMachines: List<WebApiTestMachine>

  val userLoadAgentInput: WebApiUserLoadTestMachineInput

  val userLoadAgentResourcesUri: String

  val validGeoLocations: List<String>
}
