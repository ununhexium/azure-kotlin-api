package net.lab0.azure.cloudloadtest.model.definition

import kotlin.String
import kotlin.collections.List

interface AgentGroup {
  val createdBy: String

  val creationTime: String

  val groupId: String

  val groupName: String

  val machineAccessData: List<AgentGroupAccessData>

  val machineConfiguration: WebApiUserLoadTestMachineInput

  val tenantId: String
}
