package net.lab0.azure.model.definition.enumeration.tfvc

import com.squareup.moshi.Json

enum class ItemContentType {
  @Json(name = "rawText")
  RAW_TEXT,

  @Json(name = "base64Encoded")
  BASE64_ENCODED
}
