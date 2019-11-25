package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface TaskPackageMetadata {
  /**
   * Gets the name of the package.
   */
  val type: String

  /**
   * Gets the url of the package.
   */
  val url: String

  /**
   * Gets the version of the package.
   */
  val version: String
}
