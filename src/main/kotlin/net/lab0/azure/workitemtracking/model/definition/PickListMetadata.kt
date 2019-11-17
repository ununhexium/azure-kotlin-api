package net.lab0.azure.workitemtracking.model.definition

import kotlin.Boolean
import kotlin.String

/**
 * Metadata for picklist.
 */
interface PickListMetadata {
  /**
   * ID of the picklist
   */
  val id: String

  /**
   * Indicates whether items outside of suggested list are allowed
   */
  val isSuggested: Boolean

  /**
   * Name of the picklist
   */
  val name: String

  /**
   * DataType of picklist
   */
  val type: String

  /**
   * Url of the picklist
   */
  val url: String
}
