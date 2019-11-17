package net.lab0.azure.memberentitlementmanagement.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.collections.List

interface BaseOperationResult {
  /**
   * List of error codes paired with their corresponding error messages
   */
  val errors: List<JsonObject>

  /**
   * Success status of the operation
   */
  val isSuccess: Boolean
}
