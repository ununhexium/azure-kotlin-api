package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The expand parameters for queries. Possible options are { None, Wiql, Clauses, All, Minimal }
 */
enum class QueryExpand {
  /**
   * Expands Columns, Links and ChangeInfo
   */
  @Json(name = "none")
  NONE,

  /**
   * Expands Columns, Links,  ChangeInfo and WIQL text
   */
  @Json(name = "wiql")
  WIQL,

  /**
   * Expands Columns, Links, ChangeInfo, WIQL text and clauses
   */
  @Json(name = "clauses")
  CLAUSES,

  /**
   * Expands all properties
   */
  @Json(name = "all")
  ALL,

  /**
   * Displays minimal properties and the WIQL text
   */
  @Json(name = "minimal")
  MINIMAL
}
