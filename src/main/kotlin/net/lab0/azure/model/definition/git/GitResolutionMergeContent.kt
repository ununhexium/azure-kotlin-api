package net.lab0.azure.model.definition.git

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.git.GitResolutionMergeType

interface GitResolutionMergeContent {
  val mergeType: GitResolutionMergeType

  val userMergedBlob: GitBlobRef

  val userMergedContent: List<String>
}
