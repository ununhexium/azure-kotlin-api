package net.lab0.azure.git.model.definition

import kotlin.String

/**
 * Policy failure information.
 */
interface TfvcPolicyFailureInfo {
  /**
   * Policy failure message.
   */
  val message: String

  /**
   * Name of the policy that failed.
   */
  val policyName: String
}
