package net.lab0.azure.git.model.definition

import kotlin.Boolean
import kotlin.String

/**
 * The representation of a tag definition which is sent across the wire.
 */
interface WebApiTagDefinition {
  /**
   * Whether or not the tag definition is active.
   */
  val active: Boolean

  /**
   * ID of the tag definition.
   */
  val id: String

  /**
   * The name of the tag definition.
   */
  val name: String

  /**
   * Resource URL for the Tag Definition.
   */
  val url: String
}
