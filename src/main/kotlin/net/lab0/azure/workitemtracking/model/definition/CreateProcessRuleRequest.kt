package net.lab0.azure.workitemtracking.model.definition

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Request object/class for creating a rule on a work item type.
 */
interface CreateProcessRuleRequest {
  /**
   * List of actions to take when the rule is triggered.
   */
  val actions: List<RuleAction>

  /**
   * List of conditions when the rule should be triggered.
   */
  val conditions: List<RuleCondition>

  /**
   * Indicates if the rule is disabled.
   */
  val isDisabled: Boolean

  /**
   * Name for the rule.
   */
  val name: String
}
