package net.lab0.azure.model.definition.enumeration.test

import com.squareup.moshi.Json

/**
 * Log Type
 */
enum class TestLogType {
  /**
   * Any gereric attachment.
   */
  @Json(name = "generalAttachment")
  GENERAL_ATTACHMENT,

  /**
   * Code Coverage files
   */
  @Json(name = "codeCoverage")
  CODE_COVERAGE,

  /**
   * Test Impact details.
   */
  @Json(name = "testImpact")
  TEST_IMPACT,

  /**
   * Temporary files
   */
  @Json(name = "intermediate")
  INTERMEDIATE
}
