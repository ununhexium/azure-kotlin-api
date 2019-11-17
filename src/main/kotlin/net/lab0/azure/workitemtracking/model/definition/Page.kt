package net.lab0.azure.workitemtracking.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.workitemtracking.model.definition.enumeration.PageType

/**
 * Describes a page in the work item form layout
 */
interface Page {
  val contribution: WitContribution

  /**
   * The id for the layout node.
   */
  val id: String

  /**
   * A value indicating whether this layout node has been inherited from a parent layout.  This is
   * expected to only be only set by the combiner.
   */
  val inherited: Boolean

  /**
   * A value indicating if the layout node is contribution are not.
   */
  val isContribution: Boolean

  /**
   * The label for the page.
   */
  val label: String

  /**
   * A value indicating whether any user operations are permitted on this page and the contents of
   * this page
   */
  val locked: Boolean

  /**
   * Order in which the page should appear in the layout.
   */
  val order: Int

  /**
   * A value indicating whether this layout node has been overridden by a child layout.
   */
  val overridden: Boolean

  /**
   * The icon for the page.
   */
  val pageType: PageType

  /**
   * The sections of the page.
   */
  val sections: List<Section>

  /**
   * A value indicating if the page should be hidden or not.
   */
  val visible: Boolean
}
