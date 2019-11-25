package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface DependencyBinding {
  val key: String

  val value: String
}
