package net.lab0.azure.git.model.definition

/**
 * Data object for FileDirectory conflict
 */
interface GitConflictDirectoryFile : GitConflict {
  val resolution: GitResolutionPathConflict

  val sourceTree: GitTreeRef

  val targetBlob: GitBlobRef
}
