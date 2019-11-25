package net.lab0.azure.model.definition.workitemtracking

import kotlin.collections.List

/**
 * Describes the layout of a work item type
 */
interface FormLayout {
  /**
   * Gets and sets extensions list.
   */
  val extensions: List<Extension>

  /**
   * Top level tabs of the layout.
   */
  val pages: List<Page>

  /**
   * Headers controls of the layout.
   */
  val systemControls: List<Control>
}
