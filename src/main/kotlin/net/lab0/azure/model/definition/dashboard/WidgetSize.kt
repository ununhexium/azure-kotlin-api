package net.lab0.azure.model.definition.dashboard

import kotlin.Int

interface WidgetSize {
  /**
   * The Width of the widget, expressed in dashboard grid columns.
   */
  val columnSpan: Int

  /**
   * The height of the widget, expressed in dashboard grid rows.
   */
  val rowSpan: Int
}
