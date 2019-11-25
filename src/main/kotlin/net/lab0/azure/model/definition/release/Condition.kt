package net.lab0.azure.model.definition.release

import kotlin.String
import net.lab0.azure.model.definition.enumeration.release.ConditionType

interface Condition {
  /**
   * Gets or sets the condition type.
   */
  val conditionType: ConditionType

  /**
   * Gets or sets the name of the condition. e.g. 'ReleaseStarted'.
   */
  val name: String

  /**
   * Gets or set value of the condition.
   */
  val value: String
}
