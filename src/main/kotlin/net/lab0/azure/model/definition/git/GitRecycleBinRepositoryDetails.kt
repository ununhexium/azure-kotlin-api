package net.lab0.azure.model.definition.git

import kotlin.Boolean

interface GitRecycleBinRepositoryDetails {
  /**
   * Setting to false will undo earlier deletion and restore the repository.
   */
  val deleted: Boolean
}
