package net.lab0.azure.model.definition.test

import kotlin.String
import kotlin.collections.List

interface TestResultsQuery {
  val fields: List<String>

  val results: List<TestCaseResult>

  val resultsFilter: ResultsFilter
}
