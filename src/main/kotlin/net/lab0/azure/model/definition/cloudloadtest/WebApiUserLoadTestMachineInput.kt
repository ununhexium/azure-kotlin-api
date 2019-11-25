package net.lab0.azure.model.definition.cloudloadtest

import kotlin.String

interface WebApiUserLoadTestMachineInput : WebApiLoadTestMachineInput {
  val agentGroupName: String

  val tenantId: String

  val userLoadAgentResourcesUri: String

  val vSTSAccountUri: String
}
