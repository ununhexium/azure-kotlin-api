package net.lab0.azure.work.model.definition

import kotlin.collections.List

/**
 * Expected data from PATCH
 */
interface CapacityPatch {
  val activities: List<Activity>

  val daysOff: List<DateRange>
}
