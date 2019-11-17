package net.lab0.azure.git.model.definition

import kotlin.Boolean

interface GitRecycleBinRepositoryDetails {
  /**
   * Setting to false will undo earlier deletion and restore the repository.
   */
  val deleted: Boolean
}
