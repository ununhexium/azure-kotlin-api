package net.lab0.azure.model.definition.release

import kotlin.collections.List

interface TimeZoneList {
  val utcTimeZone: TimeZone

  val validTimeZones: List<TimeZone>
}
