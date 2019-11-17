package net.lab0.azure.security.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Represents an evaluated permission.
 */
interface PermissionEvaluation {
  /**
   * Permission bit for this evaluated permission.
   */
  val permissions: Int

  /**
   * Security namespace identifier for this evaluated permission.
   */
  val securityNamespaceId: String

  /**
   * Security namespace-specific token for this evaluated permission.
   */
  val token: String

  /**
   * Permission evaluation value.
   */
  val value: Boolean
}
