package net.lab0.azure.search.model.definition

import kotlin.String

/**
 * Defines how to sort the result.
 */
interface SortOption {
  /**
   * Field name on which sorting should be done.
   */
  val field: String

  /**
   * Order (ASC/DESC) in which the results should be sorted.
   */
  val sortOrder: String
}
