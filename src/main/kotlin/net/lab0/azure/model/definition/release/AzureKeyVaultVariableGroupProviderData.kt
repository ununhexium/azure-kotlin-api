package net.lab0.azure.model.definition.release

import kotlin.String

interface AzureKeyVaultVariableGroupProviderData : VariableGroupProviderData {
  val lastRefreshedOn: String

  val serviceEndpointId: String

  val vault: String
}
