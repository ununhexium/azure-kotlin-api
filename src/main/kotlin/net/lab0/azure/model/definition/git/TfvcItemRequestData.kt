package net.lab0.azure.model.definition.git

import kotlin.Boolean
import kotlin.collections.List

/**
 * Request body used by Get Items Batch
 */
interface TfvcItemRequestData {
  /**
   * If true, include metadata about the file type
   */
  val includeContentMetadata: Boolean

  /**
   * Whether to include the _links field on the shallow references
   */
  val includeLinks: Boolean

  val itemDescriptors: List<TfvcItemDescriptor>
}
