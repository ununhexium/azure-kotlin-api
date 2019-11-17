package net.lab0.azure.git.model.definition

/**
 * Data object for DirectoryFile conflict
 */
interface GitConflictFileDirectory : GitConflict {
  val resolution: GitResolutionPathConflict

  val sourceBlob: GitBlobRef

  val targetTree: GitTreeRef
}
