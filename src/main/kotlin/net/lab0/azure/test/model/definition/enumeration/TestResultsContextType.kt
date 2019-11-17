package net.lab0.azure.test.model.definition.enumeration

import com.squareup.moshi.Json

enum class TestResultsContextType {
  @Json(name = "build")
  BUILD,

  @Json(name = "release")
  RELEASE
}
