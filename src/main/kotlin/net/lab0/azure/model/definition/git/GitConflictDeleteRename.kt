package net.lab0.azure.model.definition.git

import kotlin.String

/**
 * Data object for RenameDelete conflict
 */
interface GitConflictDeleteRename : GitConflict {
  val baseBlob: GitBlobRef

  val resolution: GitResolutionPickOneAction

  val targetBlob: GitBlobRef

  val targetNewPath: String
}
