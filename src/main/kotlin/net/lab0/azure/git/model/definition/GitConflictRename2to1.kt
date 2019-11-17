package net.lab0.azure.git.model.definition

import kotlin.String

/**
 * Data object for Rename2to1 conflict
 */
interface GitConflictRename2to1 : GitConflict {
  val resolution: GitResolutionPathConflict

  val sourceNewBlob: GitBlobRef

  val sourceOriginalBlob: GitBlobRef

  val sourceOriginalPath: String

  val targetNewBlob: GitBlobRef

  val targetOriginalBlob: GitBlobRef

  val targetOriginalPath: String
}
