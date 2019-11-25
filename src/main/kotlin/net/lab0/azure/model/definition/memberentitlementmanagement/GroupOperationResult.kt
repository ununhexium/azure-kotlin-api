package net.lab0.azure.model.definition.memberentitlementmanagement

import kotlin.String

interface GroupOperationResult : BaseOperationResult {
  /**
   * Identifier of the Group being acted upon
   */
  val groupId: String

  val result: GroupEntitlement
}
