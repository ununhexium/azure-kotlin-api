package net.lab0.azure.model.definition.git

/**
 * Data object for FileDirectory conflict
 */
interface GitConflictDirectoryFile : GitConflict {
  val resolution: GitResolutionPathConflict

  val sourceTree: GitTreeRef

  val targetBlob: GitBlobRef
}
