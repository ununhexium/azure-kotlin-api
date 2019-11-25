package net.lab0.azure.model.definition.git

import kotlin.String

/**
 * Data object for RenameRename conflict
 */
interface GitConflictRenameRename : GitConflict {
  val baseBlob: GitBlobRef

  val originalPath: String

  val resolution: GitResolutionMergeContent

  val sourceBlob: GitBlobRef

  val targetBlob: GitBlobRef
}
