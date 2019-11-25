package net.lab0.azure.model.definition.taskagent

import kotlin.Boolean
import kotlin.String

interface VariableValue {
  val isSecret: Boolean

  val value: String
}
