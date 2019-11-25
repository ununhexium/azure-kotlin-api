package net.lab0.azure.model.definition.policy

import kotlin.String

/**
 * Policy type reference.
 */
interface PolicyTypeRef {
  /**
   * Display name of the policy type.
   */
  val displayName: String

  /**
   * The policy type ID.
   */
  val id: String

  /**
   * The URL where the policy type can be retrieved.
   */
  val url: String
}
