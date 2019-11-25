package net.lab0.azure.model.definition.wiki

import kotlin.String

/**
 * Defines a wiki repository which encapsulates the git repository backing the wiki.
 */
interface Wiki : WikiCreateParameters {
  /**
   * The head commit associated with the git repository backing up the wiki.
   */
  val headCommit: String

  /**
   * The ID of the wiki which is same as the ID of the Git repository that it is backed by.
   */
  val id: String

  val repository: GitRepository
}
