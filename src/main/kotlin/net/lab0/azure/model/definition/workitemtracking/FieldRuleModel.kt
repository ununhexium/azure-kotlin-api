package net.lab0.azure.model.definition.workitemtracking

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface FieldRuleModel {
  val actions: List<RuleActionModel>

  val conditions: List<RuleConditionModel>

  val friendlyName: String

  val id: String

  val isDisabled: Boolean

  val isSystem: Boolean
}
