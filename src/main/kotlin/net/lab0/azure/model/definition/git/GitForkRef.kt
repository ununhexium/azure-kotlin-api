package net.lab0.azure.model.definition.git

/**
 * Information about a fork ref.
 */
interface GitForkRef : GitRef {
  val repository: GitRepository
}
