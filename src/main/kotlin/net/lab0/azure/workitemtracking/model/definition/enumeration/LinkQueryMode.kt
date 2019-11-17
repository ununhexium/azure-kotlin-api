package net.lab0.azure.workitemtracking.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The link query mode.
 */
enum class LinkQueryMode {
  @Json(name = "workItems")
  WORK_ITEMS,

  /**
   * Returns work items where the source, target, and link criteria are all satisfied.
   */
  @Json(name = "linksOneHopMustContain")
  LINKS_ONE_HOP_MUST_CONTAIN,

  /**
   * Returns work items that satisfy the source and link criteria, even if no linked work item
   * satisfies the target criteria.
   */
  @Json(name = "linksOneHopMayContain")
  LINKS_ONE_HOP_MAY_CONTAIN,

  /**
   * Returns work items that satisfy the source, only if no linked work item satisfies the link and
   * target criteria.
   */
  @Json(name = "linksOneHopDoesNotContain")
  LINKS_ONE_HOP_DOES_NOT_CONTAIN,

  @Json(name = "linksRecursiveMustContain")
  LINKS_RECURSIVE_MUST_CONTAIN,

  /**
   * Returns work items a hierarchy of work items that by default satisfy the source
   */
  @Json(name = "linksRecursiveMayContain")
  LINKS_RECURSIVE_MAY_CONTAIN,

  @Json(name = "linksRecursiveDoesNotContain")
  LINKS_RECURSIVE_DOES_NOT_CONTAIN
}
