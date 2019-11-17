package net.lab0.azure.memberentitlementmanagement.model.definition

import kotlin.Boolean

interface UserEntitlementsResponseBase {
  /**
   * True if all operations were successful.
   */
  val isSuccess: Boolean

  val userEntitlement: UserEntitlement
}
