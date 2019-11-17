package net.lab0.azure.git.model.definition

import net.lab0.azure.git.model.definition.enumeration.GitResolutionRename1to2Action

interface GitResolutionRename1to2 : GitResolutionMergeContent {
  val action: GitResolutionRename1to2Action
}
