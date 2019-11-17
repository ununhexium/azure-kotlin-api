package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface AzureKeyVaultVariableGroupProviderData : VariableGroupProviderData {
  val lastRefreshedOn: String

  val serviceEndpointId: String

  val vault: String
}
