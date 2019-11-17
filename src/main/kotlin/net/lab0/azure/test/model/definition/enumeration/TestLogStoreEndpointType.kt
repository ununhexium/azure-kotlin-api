package net.lab0.azure.test.model.definition.enumeration

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
