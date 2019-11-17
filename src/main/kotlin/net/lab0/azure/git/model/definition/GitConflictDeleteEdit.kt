package net.lab0.azure.git.model.definition

/**
 * Data object for EditDelete conflict
 */
interface GitConflictDeleteEdit : GitConflict {
  val baseBlob: GitBlobRef

  val resolution: GitResolutionPickOneAction

  val targetBlob: GitBlobRef
}
