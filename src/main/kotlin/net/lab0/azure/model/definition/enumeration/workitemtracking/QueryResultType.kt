package net.lab0.azure.model.definition.enumeration.workitemtracking

import com.squareup.moshi.Json

/**
 * The result type
 */
enum class QueryResultType {
  /**
   * A list of work items (for flat queries).
   */
  @Json(name = "workItem")
  WORK_ITEM,

  /**
   * A list of work item links (for OneHop and Tree queries).
   */
  @Json(name = "workItemLink")
  WORK_ITEM_LINK
}
