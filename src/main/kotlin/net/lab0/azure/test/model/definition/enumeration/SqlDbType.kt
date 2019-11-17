package net.lab0.azure.test.model.definition.enumeration

import com.squareup.moshi.Json

enum class SqlDbType {
  @Json(name = "bigInt")
  BIG_INT,

  @Json(name = "binary")
  BINARY,

  @Json(name = "bit")
  BIT,

  @Json(name = "char")
  CHAR,

  @Json(name = "dateTime")
  DATE_TIME,

  @Json(name = "decimal")
  DECIMAL,

  @Json(name = "float")
  FLOAT,

  @Json(name = "image")
  IMAGE,

  @Json(name = "int")
  INT,

  @Json(name = "money")
  MONEY,

  @Json(name = "nChar")
  N_CHAR,

  @Json(name = "nText")
  N_TEXT,

  @Json(name = "nVarChar")
  N_VAR_CHAR,

  @Json(name = "real")
  REAL,

  @Json(name = "uniqueIdentifier")
  UNIQUE_IDENTIFIER,

  @Json(name = "smallDateTime")
  SMALL_DATE_TIME,

  @Json(name = "smallInt")
  SMALL_INT,

  @Json(name = "smallMoney")
  SMALL_MONEY,

  @Json(name = "text")
  TEXT,

  @Json(name = "timestamp")
  TIMESTAMP,

  @Json(name = "tinyInt")
  TINY_INT,

  @Json(name = "varBinary")
  VAR_BINARY,

  @Json(name = "varChar")
  VAR_CHAR,

  @Json(name = "variant")
  VARIANT,

  @Json(name = "xml")
  XML,

  @Json(name = "udt")
  UDT,

  @Json(name = "structured")
  STRUCTURED,

  @Json(name = "date")
  DATE,

  @Json(name = "time")
  TIME,

  @Json(name = "dateTime2")
  DATE_TIME2,

  @Json(name = "dateTimeOffset")
  DATE_TIME_OFFSET
}
