package net.lab0.azure.git.model.definition

/**
 * Data object for DeleteEdit conflict
 */
interface GitConflictEditDelete : GitConflict {
  val baseBlob: GitBlobRef

  val resolution: GitResolutionPickOneAction

  val sourceBlob: GitBlobRef
}
