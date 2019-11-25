package net.lab0.azure.model.definition.workitemtracking

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Represent a group in the form that holds controls in it.
 */
interface Group {
  val contribution: WitContribution

  /**
   * Controls to be put in the group.
   */
  val controls: List<Control>

  /**
   * The height for the contribution.
   */
  val height: Int

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
   * Label for the group.
   */
  val label: String

  /**
   * Order in which the group should appear in the section.
   */
  val order: Int

  /**
   * A value indicating whether this layout node has been overridden by a child layout.
   */
  val overridden: Boolean

  /**
   * A value indicating if the group should be hidden or not.
   */
  val visible: Boolean
}
