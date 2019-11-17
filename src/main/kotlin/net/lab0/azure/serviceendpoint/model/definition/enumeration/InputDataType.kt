package net.lab0.azure.serviceendpoint.model.definition.enumeration

import com.squareup.moshi.Json

enum class InputDataType {
  /**
   * No data type is specified.
   */
  @Json(name = "none")
  NONE,

  /**
   * Represents a textual value.
   */
  @Json(name = "string")
  STRING,

  /**
   * Represents a numberic value.
   */
  @Json(name = "number")
  NUMBER,

  /**
   * Represents a value of true or false.
   */
  @Json(name = "boolean")
  BOOLEAN,

  /**
   * Represents a Guid.
   */
  @Json(name = "guid")
  GUID,

  /**
   * Represents a URI.
   */
  @Json(name = "uri")
  URI
}
