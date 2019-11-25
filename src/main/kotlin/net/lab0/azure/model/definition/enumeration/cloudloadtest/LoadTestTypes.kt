package net.lab0.azure.model.definition.enumeration.cloudloadtest

import com.squareup.moshi.Json

enum class LoadTestTypes {
  @Json(name = "visualStudioLoadTest")
  VISUAL_STUDIO_LOAD_TEST,

  @Json(name = "jMeter")
  J_METER,

  @Json(name = "oldLoadTestFile")
  OLD_LOAD_TEST_FILE
}
