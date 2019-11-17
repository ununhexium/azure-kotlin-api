package net.lab0.azure.testplan.model.definition.enumeration

import com.squareup.moshi.Json

enum class SuiteExpand {
  /**
   * Dont include any of the expansions in output.
   */
  @Json(name = "none")
  NONE,

  /**
   * Include children in response.
   */
  @Json(name = "children")
  CHILDREN,

  /**
   * Include default testers in response.
   */
  @Json(name = "defaultTesters")
  DEFAULT_TESTERS
}
