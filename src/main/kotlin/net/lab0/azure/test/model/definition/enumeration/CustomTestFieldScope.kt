package net.lab0.azure.test.model.definition.enumeration

import com.squareup.moshi.Json

enum class CustomTestFieldScope {
  @Json(name = "none")
  NONE,

  @Json(name = "testRun")
  TEST_RUN,

  @Json(name = "testResult")
  TEST_RESULT,

  @Json(name = "system")
  SYSTEM,

  @Json(name = "all")
  ALL
}
