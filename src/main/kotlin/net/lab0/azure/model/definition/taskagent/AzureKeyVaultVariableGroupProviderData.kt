package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface AzureKeyVaultVariableGroupProviderData : VariableGroupProviderData {
  val lastRefreshedOn: String

  val serviceEndpointId: String

  val vault: String
}
