package net.lab0.azure.core.model.definition

import kotlin.Boolean
import net.lab0.azure.core.model.definition.enumeration.ProjectChangeType

interface ProjectMessage {
  val project: ProjectInfo

  val projectChangeType: ProjectChangeType

  val shouldInvalidateSystemStore: Boolean
}
