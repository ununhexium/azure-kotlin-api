package net.lab0.azure.model.definition.npm

import kotlin.String

interface PackageVersionDetails {
  /**
   * Indicates the deprecate message of a package version
   */
  val deprecateMessage: String

  val views: JsonPatchOperation
}
