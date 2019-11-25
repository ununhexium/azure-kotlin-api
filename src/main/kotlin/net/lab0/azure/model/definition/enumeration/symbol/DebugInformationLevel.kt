package net.lab0.azure.model.definition.enumeration.symbol

import com.squareup.moshi.Json

/**
 * The information level this debug entry contains.
 */
enum class DebugInformationLevel {
  @Json(name = "none")
  NONE,

  @Json(name = "binary")
  BINARY,

  @Json(name = "publics")
  PUBLICS,

  @Json(name = "traceFormatPresent")
  TRACE_FORMAT_PRESENT,

  @Json(name = "typeInfo")
  TYPE_INFO,

  @Json(name = "lineNumbers")
  LINE_NUMBERS,

  @Json(name = "globalSymbols")
  GLOBAL_SYMBOLS,

  @Json(name = "private")
  PRIVATE,

  @Json(name = "sourceIndexed")
  SOURCE_INDEXED
}
