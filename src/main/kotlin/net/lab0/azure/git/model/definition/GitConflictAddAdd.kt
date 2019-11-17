package net.lab0.azure.git.model.definition

/**
 * Data object for AddAdd conflict
 */
interface GitConflictAddAdd : GitConflict {
  val resolution: GitResolutionMergeContent

  val sourceBlob: GitBlobRef

  val targetBlob: GitBlobRef
}
