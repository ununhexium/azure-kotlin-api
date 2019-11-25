package net.lab0.azure.model.definition.enumeration.test

import com.squareup.moshi.Json

/**
 * Test Log Reference object
 */
enum class TestLogScope {
  /**
   * Log file is associated with Run, result, subresult
   */
  @Json(name = "run")
  RUN,

  /**
   * Log File associated with Build
   */
  @Json(name = "build")
  BUILD
}
