package net.lab0.azure.test.model.definition

import kotlin.collections.List
import net.lab0.azure.test.model.definition.enumeration.Service

interface WorkItemToTestLinks {
  val executedIn: Service

  val tests: List<TestMethod>

  val workItem: WorkItemReference
}
