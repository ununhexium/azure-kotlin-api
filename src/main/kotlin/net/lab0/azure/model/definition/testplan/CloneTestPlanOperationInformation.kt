package net.lab0.azure.model.definition.testplan

/**
 * Test Plan clone information
 */
interface CloneTestPlanOperationInformation {
  val cloneOperationResponse: CloneOperationCommonResponse

  val cloneOptions: CloneOptions

  val destinationTestPlan: TestPlan

  val sourceTestPlan: SourceTestplanResponse
}
