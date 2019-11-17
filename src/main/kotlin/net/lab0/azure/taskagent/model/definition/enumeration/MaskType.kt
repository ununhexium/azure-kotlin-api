package net.lab0.azure.taskagent.model.definition.enumeration

import com.squareup.moshi.Json

enum class MaskType {
  @Json(name = "variable")
  VARIABLE,

  @Json(name = "regex")
  REGEX
}
