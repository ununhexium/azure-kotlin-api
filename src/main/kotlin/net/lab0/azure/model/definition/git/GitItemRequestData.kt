package net.lab0.azure.model.definition.git

import kotlin.Boolean
import kotlin.collections.List

interface GitItemRequestData {
  /**
   * Whether to include metadata for all items
   */
  val includeContentMetadata: Boolean

  /**
   * Whether to include the _links field on the shallow references
   */
  val includeLinks: Boolean

  /**
   * Collection of items to fetch, including path, version, and recursion level
   */
  val itemDescriptors: List<GitItemDescriptor>

  /**
   * Whether to include shallow ref to commit that last changed each item
   */
  val latestProcessedChange: Boolean
}
