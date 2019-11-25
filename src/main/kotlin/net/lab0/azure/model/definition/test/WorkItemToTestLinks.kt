package net.lab0.azure.model.definition.test

import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.test.Service

interface WorkItemToTestLinks {
  val executedIn: Service

  val tests: List<TestMethod>

  val workItem: WorkItemReference
}
