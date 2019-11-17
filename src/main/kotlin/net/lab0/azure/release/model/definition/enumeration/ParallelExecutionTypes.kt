package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

enum class ParallelExecutionTypes {
  @Json(name = "none")
  NONE,

  @Json(name = "multiConfiguration")
  MULTI_CONFIGURATION,

  @Json(name = "multiMachine")
  MULTI_MACHINE
}
