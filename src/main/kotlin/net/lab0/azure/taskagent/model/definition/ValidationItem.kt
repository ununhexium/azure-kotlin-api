package net.lab0.azure.taskagent.model.definition

import kotlin.Boolean
import kotlin.String

interface ValidationItem {
  /**
   * Tells whether the current input is valid or not
   */
  val isValid: Boolean

  /**
   * Reason for input validation failure
   */
  val reason: String

  /**
   * Type of validation item
   */
  val type: String

  /**
   * Value to validate. The conditional expression to validate for the input for "expression" type
   * Eg:eq(variables['Build.SourceBranch'], 'refs/heads/master');eq(value, 'refs/heads/master')
   */
  val value: String
}
