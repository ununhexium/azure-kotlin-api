package net.lab0.azure.model.definition.work

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface ParentChildWIMap {
  val childWorkItemIds: List<Int>

  val id: Int

  val title: String
}
