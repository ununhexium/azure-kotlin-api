package net.lab0.azure.model.definition.enumeration.cloudloadtest

import com.squareup.moshi.Json

enum class ProcessorArchitecture {
  @Json(name = "none")
  NONE,

  @Json(name = "msil")
  MSIL,

  @Json(name = "x86")
  X86,

  @Json(name = "ia64")
  IA64,

  @Json(name = "amd64")
  AMD64,

  @Json(name = "arm")
  ARM
}
