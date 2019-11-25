package net.lab0.azure.model.definition.enumeration.test

import com.squareup.moshi.Json

enum class ResultGroupType {
  /**
   * Leaf node of test result.
   */
  @Json(name = "none")
  NONE,

  /**
   * Hierarchy type of test result.
   */
  @Json(name = "rerun")
  RERUN,

  /**
   * Hierarchy type of test result.
   */
  @Json(name = "dataDriven")
  DATA_DRIVEN,

  /**
   * Hierarchy type of test result.
   */
  @Json(name = "orderedTest")
  ORDERED_TEST,

  /**
   * Unknown hierarchy type.
   */
  @Json(name = "generic")
  GENERIC
}
