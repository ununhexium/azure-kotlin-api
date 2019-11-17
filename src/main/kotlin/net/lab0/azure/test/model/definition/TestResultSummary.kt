package net.lab0.azure.test.model.definition

interface TestResultSummary {
  val aggregatedResultsAnalysis: AggregatedResultsAnalysis

  val teamProject: TeamProjectReference

  val testFailures: TestFailuresAnalysis

  val testResultsContext: TestResultsContext
}
