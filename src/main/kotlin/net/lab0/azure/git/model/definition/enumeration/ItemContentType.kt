package net.lab0.azure.git.model.definition.enumeration

import com.squareup.moshi.Json

enum class ItemContentType {
  @Json(name = "rawText")
  RAW_TEXT,

  @Json(name = "base64Encoded")
  BASE64_ENCODED
}
