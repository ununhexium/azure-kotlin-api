package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.collections.List

interface TestPlanHubData {
  val selectedSuiteId: Int

  val testPlan: TestPlan

  val testPoints: List<TestPoint>

  val testSuites: List<TestSuite>

  val totalTestPoints: Int
}
