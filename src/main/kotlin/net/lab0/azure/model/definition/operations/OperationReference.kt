package net.lab0.azure.model.definition.operations

import kotlin.String
import net.lab0.azure.model.definition.enumeration.operations.OperationStatus

/**
 * Reference for an async operation.
 */
interface OperationReference {
  /**
   * Unique identifier for the operation.
   */
  val id: String

  /**
   * Unique identifier for the plugin.
   */
  val pluginId: String

  /**
   * The current status of the operation.
   */
  val status: OperationStatus

  /**
   * URL to get the full operation object.
   */
  val url: String
}
