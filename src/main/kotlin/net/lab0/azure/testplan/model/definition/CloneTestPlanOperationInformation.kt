package net.lab0.azure.testplan.model.definition

/**
 * Test Plan clone information
 */
interface CloneTestPlanOperationInformation {
  val cloneOperationResponse: CloneOperationCommonResponse

  val cloneOptions: CloneOptions

  val destinationTestPlan: TestPlan

  val sourceTestPlan: SourceTestplanResponse
}
