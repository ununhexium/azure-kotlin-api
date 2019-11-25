package net.lab0.azure.model.definition.enumeration.test

import com.squareup.moshi.Json

enum class TestResultsContextType {
  @Json(name = "build")
  BUILD,

  @Json(name = "release")
  RELEASE
}
