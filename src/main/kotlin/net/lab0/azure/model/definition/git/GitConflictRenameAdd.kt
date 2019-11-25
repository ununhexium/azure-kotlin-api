package net.lab0.azure.model.definition.git

import kotlin.String

/**
 * Data object for AddRename conflict
 */
interface GitConflictRenameAdd : GitConflict {
  val baseBlob: GitBlobRef

  val resolution: GitResolutionPathConflict

  val sourceBlob: GitBlobRef

  val sourceOriginalPath: String

  val targetBlob: GitBlobRef
}
