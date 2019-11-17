package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface AzureResourcePermission : AzurePermission {
  val resourceGroup: String
}
