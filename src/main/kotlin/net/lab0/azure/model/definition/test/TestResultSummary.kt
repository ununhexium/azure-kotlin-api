package net.lab0.azure.model.definition.test

interface TestResultSummary {
  val aggregatedResultsAnalysis: AggregatedResultsAnalysis

  val teamProject: TeamProjectReference

  val testFailures: TestFailuresAnalysis

  val testResultsContext: TestResultsContext
}
