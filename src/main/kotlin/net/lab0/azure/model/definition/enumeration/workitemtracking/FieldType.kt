package net.lab0.azure.model.definition.enumeration.workitemtracking

import com.squareup.moshi.Json

enum class FieldType {
  @Json(name = "string")
  STRING,

  @Json(name = "integer")
  INTEGER,

  @Json(name = "dateTime")
  DATE_TIME,

  @Json(name = "plainText")
  PLAIN_TEXT,

  @Json(name = "html")
  HTML,

  @Json(name = "treePath")
  TREE_PATH,

  @Json(name = "history")
  HISTORY,

  @Json(name = "double")
  DOUBLE,

  @Json(name = "guid")
  GUID,

  @Json(name = "boolean")
  BOOLEAN,

  @Json(name = "identity")
  IDENTITY,

  @Json(name = "picklistInteger")
  PICKLIST_INTEGER,

  @Json(name = "picklistString")
  PICKLIST_STRING,

  @Json(name = "picklistDouble")
  PICKLIST_DOUBLE
}
