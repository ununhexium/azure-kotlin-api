package net.lab0.azure.model.definition.test

interface TestFailuresAnalysis {
  val existingFailures: TestFailureDetails

  val fixedTests: TestFailureDetails

  val newFailures: TestFailureDetails

  val previousContext: TestResultsContext
}
