package net.lab0.azure.model.definition.cloudloadtest

import kotlin.String

interface AgentGroupAccessData {
  val details: String

  val storageConnectionString: String

  val storageEndPoint: String

  val storageName: String

  val storageType: String
}
