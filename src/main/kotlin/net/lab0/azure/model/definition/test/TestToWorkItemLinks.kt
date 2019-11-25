package net.lab0.azure.model.definition.test

import kotlin.collections.List

interface TestToWorkItemLinks {
  val test: TestMethod

  val workItems: List<WorkItemReference>
}
