package net.lab0.azure.model.definition.npm

import kotlin.String
import net.lab0.azure.model.definition.enumeration.npm.PackagingSourceType

/**
 * Upstream source definition, including its Identity, package type, and other associated
 * information.
 */
interface UpstreamSourceInfo {
  /**
   * Identity of the upstream source.
   */
  val id: String

  /**
   * Locator for connecting to the upstream source.
   */
  val location: String

  /**
   * Display name.
   */
  val name: String

  /**
   * Source type, such as Public or Internal.
   */
  val sourceType: PackagingSourceType
}
