package net.lab0.azure.model.definition.enumeration.cloudloadtest

import com.squareup.moshi.Json

enum class TestRunType {
  @Json(name = "visualStudioLoadTest")
  VISUAL_STUDIO_LOAD_TEST,

  @Json(name = "jMeterLoadTest")
  J_METER_LOAD_TEST
}
