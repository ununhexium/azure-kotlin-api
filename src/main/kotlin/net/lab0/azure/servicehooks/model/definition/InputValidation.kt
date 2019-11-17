package net.lab0.azure.servicehooks.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.servicehooks.model.definition.enumeration.InputDataType

/**
 * Describes what values are valid for a subscription input
 */
interface InputValidation {
  val dataType: InputDataType

  val isRequired: Boolean

  val maxLength: Int

  val maxValue: String

  val minLength: Int

  val minValue: String

  val pattern: String

  val patternMismatchErrorMessage: String
}
