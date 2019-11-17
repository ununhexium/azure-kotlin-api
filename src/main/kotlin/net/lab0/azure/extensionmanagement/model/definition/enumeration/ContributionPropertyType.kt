package net.lab0.azure.extensionmanagement.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * The type of value used for this property
 */
enum class ContributionPropertyType {
  /**
   * Contribution type is unknown (value may be anything)
   */
  @Json(name = "unknown")
  UNKNOWN,

  /**
   * Value is a string
   */
  @Json(name = "string")
  STRING,

  /**
   * Value is a Uri
   */
  @Json(name = "uri")
  URI,

  /**
   * Value is a GUID
   */
  @Json(name = "guid")
  GUID,

  /**
   * Value is True or False
   */
  @Json(name = "boolean")
  BOOLEAN,

  /**
   * Value is an integer
   */
  @Json(name = "integer")
  INTEGER,

  /**
   * Value is a double
   */
  @Json(name = "double")
  DOUBLE,

  /**
   * Value is a DateTime object
   */
  @Json(name = "dateTime")
  DATE_TIME,

  /**
   * Value is a generic Dictionary/JObject/property bag
   */
  @Json(name = "dictionary")
  DICTIONARY,

  /**
   * Value is an array
   */
  @Json(name = "array")
  ARRAY,

  /**
   * Value is an arbitrary/custom object
   */
  @Json(name = "object")
  OBJECT
}
