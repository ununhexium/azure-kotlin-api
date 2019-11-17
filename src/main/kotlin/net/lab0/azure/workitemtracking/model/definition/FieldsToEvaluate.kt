package net.lab0.azure.workitemtracking.model.definition

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

/**
 * Describes a set fields for rule evaluation.
 */
interface FieldsToEvaluate {
  /**
   * List of fields to evaluate.
   */
  val fields: List<String>

  /**
   * Updated field values to evaluate.
   */
  val fieldUpdates: JsonObject

  /**
   * Initial field values.
   */
  val fieldValues: JsonObject

  /**
   * URL of the work item type for which the rules need to be executed.
   */
  val rulesFrom: List<String>
}
