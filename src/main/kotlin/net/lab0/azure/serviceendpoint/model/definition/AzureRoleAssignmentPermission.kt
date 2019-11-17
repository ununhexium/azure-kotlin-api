package net.lab0.azure.serviceendpoint.model.definition

import kotlin.String

interface AzureRoleAssignmentPermission : AzurePermission {
  val roleAssignmentId: String
}
