package net.lab0.azure.policy.model.definition

import kotlin.Int
import kotlin.String

/**
 * Policy configuration reference.
 */
interface PolicyConfigurationRef {
  /**
   * The policy configuration ID.
   */
  val id: Int

  val type: PolicyTypeRef

  /**
   * The URL where the policy configuration can be retrieved.
   */
  val url: String
}
