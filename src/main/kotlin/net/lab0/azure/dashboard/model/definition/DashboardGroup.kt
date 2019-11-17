package net.lab0.azure.dashboard.model.definition

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.dashboard.model.definition.enumeration.GroupMemberPermission
import net.lab0.azure.dashboard.model.definition.enumeration.TeamDashboardPermission

/**
 * Describes a list of dashboards associated to an owner. Currently, teams own dashboard groups.
 */
interface DashboardGroup {
  val _links: ReferenceLinks

  /**
   * A list of Dashboards held by the Dashboard Group
   */
  val dashboardEntries: List<DashboardGroupEntry>

  /**
   * Deprecated: The old permission model describing the level of permissions for the current team.
   * Pre-M125.
   */
  val permission: GroupMemberPermission

  /**
   * A permissions bit mask describing the security permissions of the current team for dashboards.
   * When this permission is the value None, use GroupMemberPermission. Permissions are evaluated based
   * on the presence of a value other than None, else the GroupMemberPermission will be saved.
   */
  val teamDashboardPermission: TeamDashboardPermission

  val url: String
}
