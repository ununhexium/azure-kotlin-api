package net.lab0.azure.release.model.definition.enumeration

import com.squareup.moshi.Json

enum class PipelineProcessTypes {
  @Json(name = "designer")
  DESIGNER,

  @Json(name = "yaml")
  YAML
}
