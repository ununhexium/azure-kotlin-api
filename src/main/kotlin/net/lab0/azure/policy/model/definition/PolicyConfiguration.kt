package net.lab0.azure.policy.model.definition

import kotlin.Boolean
import kotlin.String

/**
 * The full policy configuration with settings.
 */
interface PolicyConfiguration : VersionedPolicyConfigurationRef {
  val _links: ReferenceLinks

  val createdBy: IdentityRef

  /**
   * The date and time when the policy was created.
   */
  val createdDate: String

  /**
   * Indicates whether the policy is blocking.
   */
  val isBlocking: Boolean

  /**
   * Indicates whether the policy has been (soft) deleted.
   */
  val isDeleted: Boolean

  /**
   * Indicates whether the policy is enabled.
   */
  val isEnabled: Boolean

  val settings: JObject
}
