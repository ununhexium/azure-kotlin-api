package net.lab0.azure.release.model.definition

import kotlin.Boolean
import kotlin.String

interface VariableValue {
  val isSecret: Boolean

  val value: String
}
