package net.lab0.azure.model.definition.git

/**
 * Data object for EditDelete conflict
 */
interface GitConflictDeleteEdit : GitConflict {
  val baseBlob: GitBlobRef

  val resolution: GitResolutionPickOneAction

  val targetBlob: GitBlobRef
}
