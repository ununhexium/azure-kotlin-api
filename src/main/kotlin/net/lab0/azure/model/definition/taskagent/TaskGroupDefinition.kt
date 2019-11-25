package net.lab0.azure.model.definition.taskagent

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface TaskGroupDefinition {
  val displayName: String

  val isExpanded: Boolean

  val name: String

  val tags: List<String>

  val visibleRule: String
}
