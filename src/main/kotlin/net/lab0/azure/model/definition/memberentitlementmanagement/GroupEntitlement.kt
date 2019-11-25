package net.lab0.azure.model.definition.memberentitlementmanagement

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.memberentitlementmanagement.GroupLicensingRuleStatus

interface GroupEntitlement {
  /**
   * Extension Rules.
   */
  val extensionRules: List<Extension>

  val group: GraphGroup

  /**
   * The unique identifier which matches the Id of the GraphMember.
   */
  val id: String

  /**
   * [Readonly] The last time the group licensing rule was executed (regardless of whether any
   * changes were made).
   */
  val lastExecuted: String

  val licenseRule: AccessLevel

  /**
   * Group members. Only used when creating a new group.
   */
  val members: List<UserEntitlement>

  /**
   * Relation between a project and the member's effective permissions in that project.
   */
  val projectEntitlements: List<ProjectEntitlement>

  /**
   * The status of the group rule.
   */
  val status: GroupLicensingRuleStatus
}
