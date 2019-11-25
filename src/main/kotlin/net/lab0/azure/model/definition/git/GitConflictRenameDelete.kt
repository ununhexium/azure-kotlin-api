package net.lab0.azure.model.definition.git

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
