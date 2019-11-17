package net.lab0.azure.memberentitlementmanagement.model.definition

/**
 * Deprecated: Use UserEntitlement instead
 */
interface MemberEntitlement : UserEntitlement {
  val member: GraphMember
}
