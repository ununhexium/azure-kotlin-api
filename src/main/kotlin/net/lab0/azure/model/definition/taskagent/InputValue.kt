package net.lab0.azure.model.definition.taskagent

import javax.json.JsonObject
import kotlin.String

/**
 * Information about a single value for an input
 */
interface InputValue {
  /**
   * Any other data about this input
   */
  val data: JsonObject

  /**
   * The text to show for the display of this value
   */
  val displayValue: String

  /**
   * The value to store for this input
   */
  val value: String
}
