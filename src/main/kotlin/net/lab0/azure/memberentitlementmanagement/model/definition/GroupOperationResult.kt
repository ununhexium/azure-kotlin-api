package net.lab0.azure.memberentitlementmanagement.model.definition

import kotlin.String

interface GroupOperationResult : BaseOperationResult {
  /**
   * Identifier of the Group being acted upon
   */
  val groupId: String

  val result: GroupEntitlement
}
