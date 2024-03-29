package net.lab0.azure.model.definition.memberentitlementmanagement

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface OperationResult {
  /**
   * List of error codes paired with their corresponding error messages.
   */
  val errors: List<JsonObject>

  /**
   * Success status of the operation.
   */
  val isSuccess: Boolean

  /**
   * Identifier of the Member being acted upon.
   */
  val memberId: String

  val result: MemberEntitlement
}
