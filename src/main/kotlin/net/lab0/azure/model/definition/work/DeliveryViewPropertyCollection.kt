package net.lab0.azure.model.definition.work

import kotlin.collections.List

/**
 * Collection of properties, specific to the DeliveryTimelineView
 */
interface DeliveryViewPropertyCollection {
  val cardSettings: CardSettings

  /**
   * Field criteria
   */
  val criteria: List<FilterClause>

  /**
   * Markers. Will be missing/null if there are no markers.
   */
  val markers: List<Marker>

  /**
   * Team backlog mappings
   */
  val teamBacklogMappings: List<TeamBacklogMapping>
}
