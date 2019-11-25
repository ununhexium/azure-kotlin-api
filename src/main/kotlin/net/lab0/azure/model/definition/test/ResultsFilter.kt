package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.test.Service

interface ResultsFilter {
  val automatedTestName: String

  val branch: String

  val executedIn: Service

  val groupBy: String

  val maxCompleteDate: String

  val resultsCount: Int

  val testCaseId: Int

  val testCaseReferenceIds: List<Int>

  val testPlanId: Int

  val testPointIds: List<Int>

  val testResultsContext: TestResultsContext

  val trendDays: Int
}
