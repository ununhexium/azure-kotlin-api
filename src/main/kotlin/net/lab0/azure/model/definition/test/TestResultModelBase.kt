package net.lab0.azure.model.definition.test

import javax.json.JsonNumber
import kotlin.String

interface TestResultModelBase {
  /**
   * Comment in result.
   */
  val comment: String

  /**
   * Time when execution completed.
   */
  val completedDate: String

  /**
   * Duration of execution.
   */
  val durationInMs: JsonNumber

  /**
   * Error message in result.
   */
  val errorMessage: String

  /**
   * Test outcome of result.
   */
  val outcome: String

  /**
   * Time when execution started.
   */
  val startedDate: String
}
