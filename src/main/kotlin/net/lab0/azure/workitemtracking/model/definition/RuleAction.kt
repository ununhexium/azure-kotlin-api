package net.lab0.azure.workitemtracking.model.definition

import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.enumeration.RuleActionType

interface RuleAction {
  /**
   * Type of action to take when the rule is triggered.
   */
  val actionType: RuleActionType

  /**
   * Field on which the action should be taken.
   */
  val targetField: String

  /**
   * Value to apply on target field, once the action is taken.
   */
  val value: String
}
