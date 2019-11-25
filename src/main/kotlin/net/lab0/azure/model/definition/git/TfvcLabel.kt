package net.lab0.azure.model.definition.git

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
