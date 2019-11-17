package net.lab0.azure.git.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Information on the policy override.
 */
interface TfvcPolicyOverrideInfo {
  /**
   * Overidden policy comment.
   */
  val comment: String

  /**
   * Information on the failed policy that was overridden.
   */
  val policyFailures: List<TfvcPolicyFailureInfo>
}
