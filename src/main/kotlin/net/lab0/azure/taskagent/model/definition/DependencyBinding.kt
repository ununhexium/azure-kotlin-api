package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface DependencyBinding {
  val key: String

  val value: String
}
