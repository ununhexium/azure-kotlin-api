package net.lab0.azure.test.model.definition

import kotlin.String
import kotlin.collections.List

interface TestResultsDetails {
  val groupByField: String

  val resultsForGroup: List<TestResultsDetailsForGroup>
}
