package net.lab0.azure.model.definition.test

import javax.json.JsonObject
import kotlin.collections.List

interface TestResultsDetailsForGroup {
  val groupByValue: JsonObject

  val results: List<TestCaseResult>

  val resultsCountByOutcome: JsonObject
}
