package net.lab0.azure.taskagent.model.definition

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Information about the possible/allowed values for a given subscription input
 */
interface InputValues {
  /**
   * The default value to use for this input
   */
  val defaultValue: String

  val error: InputValuesError

  /**
   * The id of the input
   */
  val inputId: String

  /**
   * Should this input be disabled
   */
  val isDisabled: Boolean

  /**
   * Should the value be restricted to one of the values in the PossibleValues (True) or are the
   * values in PossibleValues just a suggestion (False)
   */
  val isLimitedToPossibleValues: Boolean

  /**
   * Should this input be made read-only
   */
  val isReadOnly: Boolean

  /**
   * Possible values that this input can take
   */
  val possibleValues: List<InputValue>
}
