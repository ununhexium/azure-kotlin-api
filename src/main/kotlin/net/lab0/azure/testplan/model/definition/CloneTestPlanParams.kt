package net.lab0.azure.testplan.model.definition

/**
 * Test Plan clone operation parameters
 */
interface CloneTestPlanParams {
  val cloneOptions: CloneOptions

  val destinationTestPlan: DestinationTestPlanCloneParams

  val sourceTestPlan: SourceTestPlanInfo
}
