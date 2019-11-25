package net.lab0.azure.model.definition.workitemtracking

import kotlin.String

/**
 * Request class/object to update the rule.
 */
interface UpdateProcessRuleRequest : CreateProcessRuleRequest {
  /**
   * Id to uniquely identify the rule.
   */
  val id: String
}
