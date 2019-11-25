package net.lab0.azure.model.definition.memberentitlementmanagement

import kotlin.Boolean

interface MemberEntitlementsResponseBase {
  /**
   * True if all operations were successful.
   */
  val isSuccess: Boolean

  val memberEntitlement: MemberEntitlement
}
