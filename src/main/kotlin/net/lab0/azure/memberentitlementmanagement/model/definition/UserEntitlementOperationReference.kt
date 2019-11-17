package net.lab0.azure.memberentitlementmanagement.model.definition

import kotlin.Boolean
import kotlin.collections.List

interface UserEntitlementOperationReference : OperationReference {
  /**
   * Operation completed with success or failure.
   */
  val completed: Boolean

  /**
   * True if all operations were successful.
   */
  val haveResultsSucceeded: Boolean

  /**
   * List of results for each operation.
   */
  val results: List<UserEntitlementOperationResult>
}
