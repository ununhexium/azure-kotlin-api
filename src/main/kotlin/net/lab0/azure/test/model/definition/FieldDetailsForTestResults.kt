package net.lab0.azure.test.model.definition

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

interface FieldDetailsForTestResults {
  /**
   * Group by field name
   */
  val fieldName: String

  /**
   * Group by field values
   */
  val groupsForField: List<JsonObject>
}
