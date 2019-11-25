package net.lab0.azure.model.definition.enumeration.work

import com.squareup.moshi.Json

/**
 * The additional field type
 */
enum class FieldType {
  @Json(name = "string")
  STRING,

  @Json(name = "plainText")
  PLAIN_TEXT,

  @Json(name = "integer")
  INTEGER,

  @Json(name = "dateTime")
  DATE_TIME,

  @Json(name = "treePath")
  TREE_PATH,

  @Json(name = "boolean")
  BOOLEAN,

  @Json(name = "double")
  DOUBLE
}
