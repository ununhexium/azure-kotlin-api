package net.lab0.azure.workitemtracking.model.definition

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
