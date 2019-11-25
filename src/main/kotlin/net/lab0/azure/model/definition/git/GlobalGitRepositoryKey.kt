package net.lab0.azure.model.definition.git

import kotlin.String

/**
 * Globally unique key for a repository.
 */
interface GlobalGitRepositoryKey {
  /**
   * Team Project Collection ID of the collection for the repository.
   */
  val collectionId: String

  /**
   * Team Project ID of the project for the repository.
   */
  val projectId: String

  /**
   * ID of the repository.
   */
  val repositoryId: String
}
