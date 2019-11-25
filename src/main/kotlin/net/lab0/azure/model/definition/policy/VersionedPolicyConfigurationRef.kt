package net.lab0.azure.model.definition.policy

import kotlin.Int

/**
 * A particular revision for a policy configuration.
 */
interface VersionedPolicyConfigurationRef : PolicyConfigurationRef {
  /**
   * The policy configuration revision ID.
   */
  val revision: Int
}
