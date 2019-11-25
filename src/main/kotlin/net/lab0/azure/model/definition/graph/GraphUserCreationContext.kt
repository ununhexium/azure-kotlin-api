package net.lab0.azure.model.definition.graph

import kotlin.String

/**
 * Do not attempt to use this type to create a new user. Use one of the subclasses instead. This
 * type does not contain sufficient fields to create a new user.
 */
interface GraphUserCreationContext {
  /**
   * Optional: If provided, we will use this identifier for the storage key of the created user
   */
  val storageKey: String
}
