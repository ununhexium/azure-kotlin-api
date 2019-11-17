package net.lab0.azure.npm.model.definition

import kotlin.String

/**
 * Minimal package details required to identify a package within a protocol.
 */
interface MinimalPackageDetails {
  /**
   * Package name.
   */
  val id: String

  /**
   * Package version.
   */
  val version: String
}
