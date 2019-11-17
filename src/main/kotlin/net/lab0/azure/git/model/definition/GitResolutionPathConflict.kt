package net.lab0.azure.git.model.definition

import kotlin.String
import net.lab0.azure.git.model.definition.enumeration.GitResolutionPathConflictAction

interface GitResolutionPathConflict {
  val action: GitResolutionPathConflictAction

  val renamePath: String
}
