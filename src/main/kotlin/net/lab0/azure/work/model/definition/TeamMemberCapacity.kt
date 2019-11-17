package net.lab0.azure.work.model.definition

import kotlin.collections.List

/**
 * Represents capacity for a specific team member
 */
interface TeamMemberCapacity : TeamSettingsDataContractBase {
  /**
   * Collection of capacities associated with the team member
   */
  val activities: List<Activity>

  /**
   * The days off associated with the team member
   */
  val daysOff: List<DateRange>

  val teamMember: Member
}
