package net.lab0.azure.taskagent.model.definition

import kotlin.Boolean
import kotlin.String

interface AzureKeyVaultVariableValue : VariableValue {
  val contentType: String

  val enabled: Boolean

  val expires: String
}
