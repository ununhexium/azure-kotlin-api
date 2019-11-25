package net.lab0.azure.model.definition.enumeration.test

import com.squareup.moshi.Json

enum class ResultDetails {
  /**
   * Core fields of test result. Core fields includes State, Outcome, Priority, AutomatedTestName,
   * AutomatedTestStorage, Comments, ErrorMessage etc.
   */
  @Json(name = "none")
  NONE,

  /**
   * Test iteration details in a test result.
   */
  @Json(name = "iterations")
  ITERATIONS,

  /**
   * Workitems associated with a test result.
   */
  @Json(name = "workItems")
  WORK_ITEMS,

  /**
   * Subresults in a test result.
   */
  @Json(name = "subResults")
  SUB_RESULTS,

  /**
   * Point and plan detail in a test result.
   */
  @Json(name = "point")
  POINT
}
