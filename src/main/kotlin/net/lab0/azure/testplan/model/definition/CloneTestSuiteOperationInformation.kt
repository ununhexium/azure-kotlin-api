package net.lab0.azure.testplan.model.definition

/**
 * Test Suite clone information
 */
interface CloneTestSuiteOperationInformation {
  val clonedTestSuite: TestSuiteReferenceWithProject

  val cloneOperationResponse: CloneOperationCommonResponse

  val cloneOptions: CloneOptions

  val destinationTestSuite: TestSuiteReferenceWithProject

  val sourceTestSuite: TestSuiteReferenceWithProject
}
