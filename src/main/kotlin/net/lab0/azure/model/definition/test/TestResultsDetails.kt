package net.lab0.azure.model.definition.test

import kotlin.String
import kotlin.collections.List

interface TestResultsDetails {
  val groupByField: String

  val resultsForGroup: List<TestResultsDetailsForGroup>
}
