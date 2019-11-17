package net.lab0.azure.workitemtracking.model.definition

import kotlin.String

interface RuleConditionModel {
  val conditionType: String

  val field: String

  val value: String
}
