package net.lab0.azure.model.definition.enumeration.workitemtracking

import com.squareup.moshi.Json

/**
 * Class of the process.
 */
enum class ProcessClass {
  @Json(name = "system")
  SYSTEM,

  @Json(name = "derived")
  DERIVED,

  @Json(name = "custom")
  CUSTOM
}
