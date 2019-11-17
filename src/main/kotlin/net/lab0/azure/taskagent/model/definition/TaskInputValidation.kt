package net.lab0.azure.taskagent.model.definition

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
