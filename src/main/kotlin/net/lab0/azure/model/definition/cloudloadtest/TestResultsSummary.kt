package net.lab0.azure.model.definition.cloudloadtest

import kotlin.collections.List

interface TestResultsSummary {
  val overallPageSummary: PageSummary

  val overallRequestSummary: RequestSummary

  val overallScenarioSummary: ScenarioSummary

  val overallTestSummary: TestSummary

  val overallTransactionSummary: TransactionSummary

  val topSlowPages: List<PageSummary>

  val topSlowRequests: List<RequestSummary>

  val topSlowTests: List<TestSummary>

  val topSlowTransactions: List<TransactionSummary>
}
