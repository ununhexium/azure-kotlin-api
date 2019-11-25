package net.lab0.azure.model.definition.enumeration.release

import com.squareup.moshi.Json

enum class PipelineProcessTypes {
  @Json(name = "designer")
  DESIGNER,

  @Json(name = "yaml")
  YAML
}
