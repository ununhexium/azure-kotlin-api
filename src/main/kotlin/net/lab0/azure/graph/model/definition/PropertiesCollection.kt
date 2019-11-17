package net.lab0.azure.graph.model.definition

import javax.json.JsonObject
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * The class represents a property bag as a collection of key-value pairs. Values of all primitive
 * types (any type with a `TypeCode != TypeCode.Object`) except for `DBNull` are accepted. Values of
 * type Byte[], Int32, Double, DateType and String preserve their type, other primitives are retuned as
 * a String. Byte[] expected as base64 encoded string.
 */
interface PropertiesCollection {
  /**
   * The count of properties in the collection.
   */
  val count: Int

  val item: JsonObject

  /**
   * The set of keys in the collection.
   */
  val keys: List<String>

  /**
   * The set of values in the collection.
   */
  val values: List<String>
}
