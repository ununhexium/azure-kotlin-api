package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface AzureRoleAssignmentPermission : AzurePermission {
  val roleAssignmentId: String
}
