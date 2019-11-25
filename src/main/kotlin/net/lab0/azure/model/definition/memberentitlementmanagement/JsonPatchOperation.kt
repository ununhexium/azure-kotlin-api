package net.lab0.azure.model.definition.memberentitlementmanagement

import javax.json.JsonObject
import kotlin.String
import net.lab0.azure.model.definition.enumeration.memberentitlementmanagement.Operation

/**
 * The JSON model for a JSON Patch operation
 */
interface JsonPatchOperation {
  /**
   * The path to copy from for the Move/Copy operation.
   */
  val from: String

  /**
   * The patch operation
   */
  val op: Operation

  /**
   * The path for the operation
   */
  val path: String

  /**
   * The value for the operation. This is either a primitive or a JToken.
   */
  val value: JsonObject
}
