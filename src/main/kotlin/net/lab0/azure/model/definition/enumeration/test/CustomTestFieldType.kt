package net.lab0.azure.model.definition.enumeration.test

import com.squareup.moshi.Json

enum class CustomTestFieldType {
  @Json(name = "bit")
  BIT,

  @Json(name = "dateTime")
  DATE_TIME,

  @Json(name = "int")
  INT,

  @Json(name = "float")
  FLOAT,

  @Json(name = "string")
  STRING,

  @Json(name = "guid")
  GUID
}
