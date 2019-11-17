package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface LinkedWorkItemsQuery {
  val automatedTestNames: List<String>

  val planId: Int

  val pointIds: List<Int>

  val suiteIds: List<Int>

  val testCaseIds: List<Int>

  val workItemCategory: String
}
