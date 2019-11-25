package net.lab0.azure.model.definition.git

import net.lab0.azure.model.definition.enumeration.git.GitResolutionRename1to2Action

interface GitResolutionRename1to2 : GitResolutionMergeContent {
  val action: GitResolutionRename1to2Action
}
