package net.lab0.azure.model.definition.servicehooks

import kotlin.Boolean
import kotlin.String
import net.lab0.azure.model.definition.enumeration.servicehooks.InputFilterOperator

/**
 * An expression which can be applied to filter a list of subscription inputs
 */
interface InputFilterCondition {
  /**
   * Whether or not to do a case sensitive match
   */
  val caseSensitive: Boolean

  /**
   * The Id of the input to filter on
   */
  val inputId: String

  /**
   * The "expected" input value to compare with the actual input value
   */
  val inputValue: String

  /**
   * The operator applied between the expected and actual input value
   */
  val operator: InputFilterOperator
}
