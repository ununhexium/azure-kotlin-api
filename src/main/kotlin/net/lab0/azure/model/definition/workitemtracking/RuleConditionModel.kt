package net.lab0.azure.model.definition.workitemtracking

import kotlin.String

interface RuleConditionModel {
  val conditionType: String

  val field: String

  val value: String
}
