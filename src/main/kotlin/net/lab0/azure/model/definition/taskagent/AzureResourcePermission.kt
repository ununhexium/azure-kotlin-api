package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface AzureResourcePermission : AzurePermission {
  val resourceGroup: String
}
