package net.lab0.azure.model.definition.git

import net.lab0.azure.model.definition.enumeration.git.GitResolutionWhichAction

interface GitResolutionPickOneAction {
  val action: GitResolutionWhichAction
}
