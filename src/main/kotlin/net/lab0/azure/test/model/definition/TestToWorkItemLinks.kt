package net.lab0.azure.test.model.definition

import kotlin.collections.List

interface TestToWorkItemLinks {
  val test: TestMethod

  val workItems: List<WorkItemReference>
}
