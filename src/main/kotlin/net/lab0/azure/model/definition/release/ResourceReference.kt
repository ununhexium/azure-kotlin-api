package net.lab0.azure.model.definition.release

import kotlin.String

/**
 * Represents a reference to a resource.
 */
interface ResourceReference {
  /**
   * An alias to be used when referencing the resource.
   */
  val alias: String
}
