package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.collections.List

interface TestPlanCloneRequest {
  val destinationTestPlan: TestPlan

  val options: CloneOptions

  val suiteIds: List<Int>
}
