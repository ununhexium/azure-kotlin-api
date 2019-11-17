package net.lab0.azure.memberentitlementmanagement.model.definition

import kotlin.collections.List

interface UserEntitlementsPatchResponse : UserEntitlementsResponseBase {
  /**
   * List of results for each operation.
   */
  val operationResults: List<UserEntitlementOperationResult>
}
