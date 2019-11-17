package net.lab0.azure.testplan.model.definition

/**
 * Test Suite clone operation parameters
 */
interface CloneTestSuiteParams {
  val cloneOptions: CloneOptions

  val destinationTestSuite: DestinationTestSuiteInfo

  val sourceTestSuite: SourceTestSuiteInfo
}
