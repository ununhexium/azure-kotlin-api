package net.lab0.azure.memberentitlementmanagement.model.definition

import kotlin.collections.List

interface MemberEntitlementsPatchResponse : MemberEntitlementsResponseBase {
  /**
   * List of results for each operation
   */
  val operationResults: List<OperationResult>
}
