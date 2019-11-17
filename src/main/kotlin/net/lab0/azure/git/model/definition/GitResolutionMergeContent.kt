package net.lab0.azure.git.model.definition

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.git.model.definition.enumeration.GitResolutionMergeType

interface GitResolutionMergeContent {
  val mergeType: GitResolutionMergeType

  val userMergedBlob: GitBlobRef

  val userMergedContent: List<String>
}
