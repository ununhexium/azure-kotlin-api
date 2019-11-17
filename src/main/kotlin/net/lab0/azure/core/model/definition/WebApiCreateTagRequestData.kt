package net.lab0.azure.core.model.definition

import kotlin.String

/**
 * The representation of data needed to create a tag definition which is sent across the wire.
 */
interface WebApiCreateTagRequestData {
  /**
   * Name of the tag definition that will be created.
   */
  val name: String
}
