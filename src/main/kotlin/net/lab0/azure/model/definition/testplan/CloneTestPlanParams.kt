package net.lab0.azure.model.definition.testplan

/**
 * Test Plan clone operation parameters
 */
interface CloneTestPlanParams {
  val cloneOptions: CloneOptions

  val destinationTestPlan: DestinationTestPlanCloneParams

  val sourceTestPlan: SourceTestPlanInfo
}
