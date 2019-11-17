package net.lab0.azure.git.model.definition

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
