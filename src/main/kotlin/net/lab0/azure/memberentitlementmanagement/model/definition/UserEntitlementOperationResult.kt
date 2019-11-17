package net.lab0.azure.memberentitlementmanagement.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface UserEntitlementOperationResult {
  /**
   * List of error codes paired with their corresponding error messages.
   */
  val errors: List<JsonObject>

  /**
   * Success status of the operation.
   */
  val isSuccess: Boolean

  val result: UserEntitlement

  /**
   * Identifier of the Member being acted upon.
   */
  val userId: String
}
