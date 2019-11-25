package net.lab0.azure.model.definition.git

import kotlin.String

/**
 * Data object for RenameAdd conflict
 */
interface GitConflictAddRename : GitConflict {
  val baseBlob: GitBlobRef

  val resolution: GitResolutionPathConflict

  val sourceBlob: GitBlobRef

  val targetBlob: GitBlobRef

  val targetOriginalPath: String
}
