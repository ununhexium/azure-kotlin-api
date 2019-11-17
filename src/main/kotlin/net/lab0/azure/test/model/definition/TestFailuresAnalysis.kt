package net.lab0.azure.test.model.definition

interface TestFailuresAnalysis {
  val existingFailures: TestFailureDetails

  val fixedTests: TestFailureDetails

  val newFailures: TestFailureDetails

  val previousContext: TestResultsContext
}
