package net.lab0.azure.model.definition.workitemtracking

import kotlin.String
import net.lab0.azure.model.definition.enumeration.workitemtracking.CustomizationType

/**
 * Process Rule Response.
 */
interface ProcessRule : CreateProcessRuleRequest {
  /**
   * Indicates if the rule is system generated or created by user.
   */
  val customizationType: CustomizationType

  /**
   * Id to uniquely identify the rule.
   */
  val id: String

  /**
   * Resource Url.
   */
  val url: String
}
