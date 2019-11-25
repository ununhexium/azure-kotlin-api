package net.lab0.azure.model.definition.enumeration.test

import com.squareup.moshi.Json

/**
 * Test log store endpoint type.
 */
enum class TestLogStoreEndpointType {
  @Json(name = "root")
  ROOT,

  @Json(name = "file")
  FILE
}
