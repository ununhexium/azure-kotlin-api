package net.lab0.azure.model.definition.enumeration.workitemtracking

import com.squareup.moshi.Json

/**
 * Node structure type.
 */
enum class TreeNodeStructureType {
  /**
   * Area type.
   */
  @Json(name = "area")
  AREA,

  /**
   * Iteration type.
   */
  @Json(name = "iteration")
  ITERATION
}
