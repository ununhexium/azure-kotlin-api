package net.lab0.azure.model.definition.enumeration.taskagent

import com.squareup.moshi.Json

enum class MaskType {
  @Json(name = "variable")
  VARIABLE,

  @Json(name = "regex")
  REGEX
}
