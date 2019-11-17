package net.lab0.azure.workitemtracking.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Represent a control in the form.
 */
interface Control {
  val contribution: WitContribution

  /**
   * Type of the control.
   */
  val controlType: String

  /**
   * Height of the control, for html controls.
   */
  val height: Int

  /**
   * The id for the layout node.
   */
  val id: String

  /**
   * A value indicating whether this layout node has been inherited. from a parent layout.  This is
   * expected to only be only set by the combiner.
   */
  val inherited: Boolean

  /**
   * A value indicating if the layout node is contribution or not.
   */
  val isContribution: Boolean

  /**
   * Label for the field.
   */
  val label: String

  /**
   * Inner text of the control.
   */
  val metadata: String

  /**
   * Order in which the control should appear in its group.
   */
  val order: Int

  /**
   * A value indicating whether this layout node has been overridden . by a child layout.
   */
  val overridden: Boolean

  /**
   * A value indicating if the control is readonly.
   */
  val readOnly: Boolean

  /**
   * A value indicating if the control should be hidden or not.
   */
  val visible: Boolean

  /**
   * Watermark text for the textbox.
   */
  val watermark: String
}
