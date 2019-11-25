package net.lab0.azure.model.definition.npm

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
