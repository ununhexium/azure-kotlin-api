package net.lab0.azure.cloudloadtest.model.definition.enumeration

import com.squareup.moshi.Json

enum class MessageType {
  @Json(name = "info")
  INFO,

  @Json(name = "output")
  OUTPUT,

  @Json(name = "error")
  ERROR,

  @Json(name = "warning")
  WARNING,

  @Json(name = "critical")
  CRITICAL
}
