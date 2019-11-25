package net.lab0.azure.model.definition.git

/**
 * Data object for AddAdd conflict
 */
interface GitConflictAddAdd : GitConflict {
  val resolution: GitResolutionMergeContent

  val sourceBlob: GitBlobRef

  val targetBlob: GitBlobRef
}
