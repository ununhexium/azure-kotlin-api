package net.lab0.azure.git.model.definition

import kotlin.String

/**
 * Data object for DeleteRename conflict
 */
interface GitConflictRenameDelete : GitConflict {
  val baseBlob: GitBlobRef

  val resolution: GitResolutionPickOneAction

  val sourceBlob: GitBlobRef

  val sourceNewPath: String
}
