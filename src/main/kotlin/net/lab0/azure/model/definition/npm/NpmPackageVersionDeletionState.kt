package net.lab0.azure.model.definition.npm

import kotlin.String

/**
 * Deletion state of an npm package.
 */
interface NpmPackageVersionDeletionState {
  /**
   * Name of the package.
   */
  val name: String

  /**
   * UTC date the package was unpublished.
   */
  val unpublishedDate: String

  /**
   * Version of the package.
   */
  val version: String
}
