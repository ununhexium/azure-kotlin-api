package net.lab0.azure.workitemtracking.model.definition

import kotlin.String

interface RuleActionModel {
  val actionType: String

  val targetField: String

  val value: String
}
