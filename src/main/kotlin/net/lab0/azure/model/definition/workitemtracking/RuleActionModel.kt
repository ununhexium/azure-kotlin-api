package net.lab0.azure.model.definition.workitemtracking

import kotlin.String

interface RuleActionModel {
  val actionType: String

  val targetField: String

  val value: String
}
