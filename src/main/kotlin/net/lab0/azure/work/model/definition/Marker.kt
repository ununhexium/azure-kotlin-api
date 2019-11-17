package net.lab0.azure.work.model.definition

import kotlin.String

/**
 * Client serialization contract for Delivery Timeline Markers.
 */
interface Marker {
  /**
   * Color associated with the marker.
   */
  val color: String

  /**
   * Where the marker should be displayed on the timeline.
   */
  val date: String

  /**
   * Label/title for the marker.
   */
  val label: String
}
