package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface LinkedWorkItemsQueryResult {
  val automatedTestName: String

  val planId: Int

  val pointId: Int

  val suiteId: Int

  val testCaseId: Int

  val workItems: List<WorkItemReference>
}
