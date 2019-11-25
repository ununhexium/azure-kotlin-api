package net.lab0.azure.model.definition.testplan

/**
 * Test Suite clone operation parameters
 */
interface CloneTestSuiteParams {
  val cloneOptions: CloneOptions

  val destinationTestSuite: DestinationTestSuiteInfo

  val sourceTestSuite: SourceTestSuiteInfo
}
