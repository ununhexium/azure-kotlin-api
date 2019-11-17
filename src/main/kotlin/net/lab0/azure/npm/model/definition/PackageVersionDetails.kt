package net.lab0.azure.npm.model.definition

import kotlin.String

interface PackageVersionDetails {
  /**
   * Indicates the deprecate message of a package version
   */
  val deprecateMessage: String

  val views: JsonPatchOperation
}
