package net.lab0.azure.tfvc.model.definition

import kotlin.collections.List

/**
 * Metadata for a label.
 */
interface TfvcLabel : TfvcLabelRef {
  /**
   * List of items.
   */
  val items: List<TfvcItem>
}
