package net.lab0.azure.memberentitlementmanagement.model.definition

import kotlin.collections.List

interface UsersSummary {
  /**
   * Available Access Levels.
   */
  val availableAccessLevels: List<AccessLevel>

  /**
   * Summary of Extensions in the account.
   */
  val extensions: List<ExtensionSummaryData>

  /**
   * Group Options.
   */
  val groupOptions: List<GroupOption>

  /**
   * Summary of Licenses in the Account.
   */
  val licenses: List<LicenseSummaryData>

  /**
   * Summary of Projects in the Account.
   */
  val projectRefs: List<ProjectRef>
}
