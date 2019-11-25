package net.lab0.azure.model.definition.memberentitlementmanagement

import kotlin.collections.List

interface UserEntitlementsPatchResponse : UserEntitlementsResponseBase {
  /**
   * List of results for each operation.
   */
  val operationResults: List<UserEntitlementOperationResult>
}
