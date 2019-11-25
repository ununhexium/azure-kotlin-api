package net.lab0.azure.model.definition.test

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
