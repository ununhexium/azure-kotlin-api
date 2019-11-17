package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.collections.List

interface TestPlanHubData {
  val selectedSuiteId: Int

  val testPlan: TestPlan

  val testPoints: List<TestPoint>

  val testSuites: List<TestSuite>

  val totalTestPoints: Int
}
