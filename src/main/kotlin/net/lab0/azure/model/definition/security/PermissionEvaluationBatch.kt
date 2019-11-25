package net.lab0.azure.model.definition.security

import kotlin.Boolean
import kotlin.collections.List

/**
 * Represents a set of evaluated permissions.
 */
interface PermissionEvaluationBatch {
  /**
   * True if members of the Administrators group should always pass the security check.
   */
  val alwaysAllowAdministrators: Boolean

  /**
   * Array of permission evaluations to evaluate.
   */
  val evaluations: List<PermissionEvaluation>
}
