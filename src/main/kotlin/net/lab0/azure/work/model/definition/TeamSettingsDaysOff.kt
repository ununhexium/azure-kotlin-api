package net.lab0.azure.work.model.definition

import kotlin.collections.List

interface TeamSettingsDaysOff : TeamSettingsDataContractBase {
  val daysOff: List<DateRange>
}
