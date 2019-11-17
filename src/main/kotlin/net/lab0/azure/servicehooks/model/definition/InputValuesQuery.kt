package net.lab0.azure.servicehooks.model.definition

import javax.json.JsonObject
import kotlin.collections.List

interface InputValuesQuery {
  val currentValues: JsonObject

  /**
   * The input values to return on input, and the result from the consumer on output.
   */
  val inputValues: List<InputValues>

  /**
   * Subscription containing information about the publisher/consumer and the current input values
   */
  val resource: JsonObject
}
