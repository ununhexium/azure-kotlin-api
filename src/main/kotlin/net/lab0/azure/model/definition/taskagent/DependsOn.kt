package net.lab0.azure.model.definition.taskagent

import kotlin.String
import kotlin.collections.List

interface DependsOn {
  val input: String

  val map: List<DependencyBinding>
}
