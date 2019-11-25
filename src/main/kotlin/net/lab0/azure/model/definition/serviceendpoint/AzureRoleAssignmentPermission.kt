package net.lab0.azure.model.definition.serviceendpoint

import kotlin.String

interface AzureRoleAssignmentPermission : AzurePermission {
  val roleAssignmentId: String
}
