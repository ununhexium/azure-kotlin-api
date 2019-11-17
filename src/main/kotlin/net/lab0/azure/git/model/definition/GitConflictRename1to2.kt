package net.lab0.azure.git.model.definition

import kotlin.String

/**
 * Data object for Rename1to2 conflict
 */
interface GitConflictRename1to2 : GitConflict {
  val baseBlob: GitBlobRef

  val resolution: GitResolutionRename1to2

  val sourceBlob: GitBlobRef

  val sourceNewPath: String

  val targetBlob: GitBlobRef

  val targetNewPath: String
}
