package net.lab0.azure.workitemtracking.model.definition

import kotlin.Boolean

/**
 * A sort column.
 */
interface WorkItemQuerySortColumn {
  /**
   * The direction to sort by.
   */
  val descending: Boolean

  val field: WorkItemFieldReference
}
