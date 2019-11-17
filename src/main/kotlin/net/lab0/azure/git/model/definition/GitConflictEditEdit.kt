package net.lab0.azure.git.model.definition

/**
 * Data object for EditEdit conflict
 */
interface GitConflictEditEdit : GitConflict {
  val baseBlob: GitBlobRef

  val resolution: GitResolutionMergeContent

  val sourceBlob: GitBlobRef

  val targetBlob: GitBlobRef
}
