package net.lab0.azure.servicehooks.model.definition

import kotlin.String

/**
 * Error information related to a subscription input value.
 */
interface InputValuesError {
  /**
   * The error message.
   */
  val message: String
}
