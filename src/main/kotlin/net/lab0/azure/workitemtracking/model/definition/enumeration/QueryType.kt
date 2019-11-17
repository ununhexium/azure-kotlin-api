package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The type of query.
 */
enum class QueryType {
  /**
   * Gets a flat list of work items.
   */
  @Json(name = "flat")
  FLAT,

  /**
   * Gets a tree of work items showing their link hierarchy.
   */
  @Json(name = "tree")
  TREE,

  /**
   * Gets a list of work items and their direct links.
   */
  @Json(name = "oneHop")
  ONE_HOP
}
