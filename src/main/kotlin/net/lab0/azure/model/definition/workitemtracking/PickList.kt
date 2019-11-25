package net.lab0.azure.model.definition.workitemtracking

import kotlin.String
import kotlin.collections.List

/**
 * Picklist.
 */
interface PickList : PickListMetadata {
  /**
   * A list of PicklistItemModel.
   */
  val items: List<String>
}
