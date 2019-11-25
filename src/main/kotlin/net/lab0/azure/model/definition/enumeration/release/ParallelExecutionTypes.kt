package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

enum class ParallelExecutionTypes {
  @Json(name = "none")
  NONE,

  @Json(name = "multiConfiguration")
  MULTI_CONFIGURATION,

  @Json(name = "multiMachine")
  MULTI_MACHINE
}
