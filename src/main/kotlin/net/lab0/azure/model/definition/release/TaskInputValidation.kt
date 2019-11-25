package net.lab0.azure.model.definition.release

import kotlin.String

interface TaskInputValidation {
  /**
   * Conditional expression
   */
  val expression: String

  /**
   * Message explaining how user can correct if validation fails
   */
  val message: String
}
