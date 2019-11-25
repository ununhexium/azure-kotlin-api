package net.lab0.azure.model.definition.core

import kotlin.Boolean
import net.lab0.azure.model.definition.enumeration.core.ProjectChangeType

interface ProjectMessage {
  val project: ProjectInfo

  val projectChangeType: ProjectChangeType

  val shouldInvalidateSystemStore: Boolean
}
