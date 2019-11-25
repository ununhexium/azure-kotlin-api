package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.collections.List

interface TestPlansWithSelection {
  val lastSelectedPlan: Int

  val lastSelectedSuite: Int

  val plans: List<TestPlan>
}
