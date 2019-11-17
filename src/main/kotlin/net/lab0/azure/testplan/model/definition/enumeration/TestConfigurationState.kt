package net.lab0.azure.testplan.model.definition.enumeration

import com.squareup.moshi.Json

/**
 * State of the configuration
 */
enum class TestConfigurationState {
  /**
   * The configuration can be used for new test runs.
   */
  @Json(name = "active")
  ACTIVE,

  /**
   * The configuration has been retired and should not be used for new test runs.
   */
  @Json(name = "inactive")
  INACTIVE
}
