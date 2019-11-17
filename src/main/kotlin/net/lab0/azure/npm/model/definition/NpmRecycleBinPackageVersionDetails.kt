package net.lab0.azure.npm.model.definition

import kotlin.Boolean

interface NpmRecycleBinPackageVersionDetails {
  /**
   * Setting to false will undo earlier deletion and restore the package to feed.
   */
  val deleted: Boolean
}
