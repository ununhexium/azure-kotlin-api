package net.lab0.azure.policy.model.definition

import kotlin.String

/**
 * User-friendly policy type with description (used for querying policy types).
 */
interface PolicyType : PolicyTypeRef {
  val _links: ReferenceLinks

  /**
   * Detailed description of the policy type.
   */
  val description: String
}
