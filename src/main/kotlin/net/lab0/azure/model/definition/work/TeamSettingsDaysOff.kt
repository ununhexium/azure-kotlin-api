package net.lab0.azure.model.definition.work

import kotlin.collections.List

interface TeamSettingsDaysOff : TeamSettingsDataContractBase {
  val daysOff: List<DateRange>
}
