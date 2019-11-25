package net.lab0.azure.model.definition.git

import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.GitResolutionPathConflictAction

interface GitResolutionPathConflict {
  val action: GitResolutionPathConflictAction

  val renamePath: String
}
