package net.lab0.azure.git.model.definition

import net.lab0.azure.git.model.definition.enumeration.GitResolutionWhichAction

interface GitResolutionPickOneAction {
  val action: GitResolutionWhichAction
}
