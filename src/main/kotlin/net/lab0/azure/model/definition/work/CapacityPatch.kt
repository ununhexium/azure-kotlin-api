package net.lab0.azure.model.definition.work

import kotlin.collections.List

/**
 * Expected data from PATCH
 */
interface CapacityPatch {
  val activities: List<Activity>

  val daysOff: List<DateRange>
}
