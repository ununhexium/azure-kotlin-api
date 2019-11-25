package net.lab0.azure.model.definition.enumeration.test

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
