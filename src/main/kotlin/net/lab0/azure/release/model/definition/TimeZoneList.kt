package net.lab0.azure.release.model.definition

import kotlin.collections.List

interface TimeZoneList {
  val utcTimeZone: TimeZone

  val validTimeZones: List<TimeZone>
}
