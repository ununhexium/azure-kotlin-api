package net.lab0.azure.work.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface ParentChildWIMap {
  val childWorkItemIds: List<Int>

  val id: Int

  val title: String
}
