package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.collections.List

interface TestPlansWithSelection {
  val lastSelectedPlan: Int

  val lastSelectedSuite: Int

  val plans: List<TestPlan>
}
