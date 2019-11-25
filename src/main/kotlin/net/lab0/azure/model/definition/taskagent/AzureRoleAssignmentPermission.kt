package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface AzureRoleAssignmentPermission : AzurePermission {
  val roleAssignmentId: String
}
