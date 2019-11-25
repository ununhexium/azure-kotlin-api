package net.lab0.azure.model.definition.test

import javax.json.JsonObject
import kotlin.String

/**
 * A custom field information.
 */
interface CustomTestField {
  /**
   * Field Name.
   */
  val fieldName: String

  /**
   * Field value.
   */
  val value: JsonObject
}
