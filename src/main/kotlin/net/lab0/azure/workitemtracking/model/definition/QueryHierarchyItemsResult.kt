package net.lab0.azure.workitemtracking.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.collections.List

interface QueryHierarchyItemsResult {
  /**
   * The count of items.
   */
  val count: Int

  /**
   * Indicates if the max return limit was hit but there are still more items
   */
  val hasMore: Boolean

  /**
   * The list of items
   */
  val value: List<QueryHierarchyItem>
}
