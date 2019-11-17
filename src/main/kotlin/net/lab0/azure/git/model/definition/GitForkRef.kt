package net.lab0.azure.git.model.definition

/**
 * Information about a fork ref.
 */
interface GitForkRef : GitRef {
  val repository: GitRepository
}
