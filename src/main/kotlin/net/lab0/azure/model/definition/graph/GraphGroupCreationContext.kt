package net.lab0.azure.model.definition.graph

import kotlin.String

/**
 * Do not attempt to use this type to create a new group. This type does not contain sufficient
 * fields to create a new group.
 */
interface GraphGroupCreationContext {
  /**
   * Optional: If provided, we will use this identifier for the storage key of the created group
   */
  val storageKey: String
}
