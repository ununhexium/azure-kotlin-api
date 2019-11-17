package net.lab0.azure.test.model.definition

import javax.json.JsonObject
import kotlin.Int
import kotlin.String

interface AggregatedDataForResultTrend {
  /**
   * This is tests execution duration.
   */
  val duration: String

  val resultsByOutcome: JsonObject

  val runSummaryByState: JsonObject

  val testResultsContext: TestResultsContext

  val totalTests: Int
}
