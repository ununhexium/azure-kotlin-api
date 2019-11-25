package net.lab0.azure.model.definition.enumeration.cloudloadtest

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
