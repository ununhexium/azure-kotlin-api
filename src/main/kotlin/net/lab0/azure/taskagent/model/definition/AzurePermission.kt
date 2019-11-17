package net.lab0.azure.taskagent.model.definition

import kotlin.Boolean
import kotlin.String

interface AzurePermission {
  val provisioned: Boolean

  val resourceProvider: String
}
