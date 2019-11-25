package net.lab0.azure.model.definition.enumeration.extensionmanagement

import com.squareup.moshi.Json

/**
 * Query options tpo be used when fetching ContributionNodes
 */
enum class ContributionQueryOptions {
  @Json(name = "none")
  NONE,

  /**
   * Include the direct contributions that have the ids queried.
   */
  @Json(name = "includeSelf")
  INCLUDE_SELF,

  /**
   * Include the contributions that directly target the contributions queried.
   */
  @Json(name = "includeChildren")
  INCLUDE_CHILDREN,

  /**
   * Include the contributions from the entire sub-tree targetting the contributions queried.
   */
  @Json(name = "includeSubTree")
  INCLUDE_SUB_TREE,

  /**
   * Include the contribution being queried as well as all contributions that target them
   * recursively.
   */
  @Json(name = "includeAll")
  INCLUDE_ALL,

  /**
   * Some callers may want the entire tree back without constraint evaluation being performed.
   */
  @Json(name = "ignoreConstraints")
  IGNORE_CONSTRAINTS
}
