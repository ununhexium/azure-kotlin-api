package net.lab0.azure.model.definition.workitemtracking

import kotlin.String
import net.lab0.azure.model.definition.enumeration.workitemtracking.RuleConditionType

/**
 * Defines a condition on a field when the rule should be triggered.
 */
interface RuleCondition {
  /**
   * Type of condition. $When. This condition limits the execution of its children to cases when
   * another field has a particular value, i.e. when the Is value of the referenced field is equal to
   * the given literal value. $WhenNot.This condition limits the execution of its children to cases
   * when another field does not have a particular value, i.e.when the Is value of the referenced field
   * is not equal to the given literal value. $WhenChanged.This condition limits the execution of its
   * children to cases when another field has changed, i.e.when the Is value of the referenced field is
   * not equal to the Was value of that field. $WhenNotChanged.This condition limits the execution of
   * its children to cases when another field has not changed, i.e.when the Is value of the referenced
   * field is equal to the Was value of that field.
   */
  val conditionType: RuleConditionType

  /**
   * Field that defines condition.
   */
  val field: String

  /**
   * Value of field to define the condition for rule.
   */
  val value: String
}
