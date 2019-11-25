package net.lab0.azure.model.definition.enumeration.workitemtracking

import com.squareup.moshi.Json

/**
 * The recursion option for use in a tree query.
 */
enum class QueryRecursionOption {
  /**
   * Returns work items that satisfy the source, even if no linked work item satisfies the target
   * and link criteria.
   */
  @Json(name = "parentFirst")
  PARENT_FIRST,

  /**
   * Returns work items that satisfy the target criteria, even if no work item satisfies the source
   * and link criteria.
   */
  @Json(name = "childFirst")
  CHILD_FIRST
}
