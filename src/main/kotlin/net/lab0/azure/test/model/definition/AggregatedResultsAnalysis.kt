package net.lab0.azure.test.model.definition

import javax.json.JsonObject
import kotlin.Int
import kotlin.String

interface AggregatedResultsAnalysis {
  val duration: String

  val notReportedResultsByOutcome: JsonObject

  val previousContext: TestResultsContext

  val resultsByOutcome: JsonObject

  val resultsDifference: AggregatedResultsDifference

  val runSummaryByOutcome: JsonObject

  val runSummaryByState: JsonObject

  val totalTests: Int
}
