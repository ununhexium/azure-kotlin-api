package net.lab0.azure.model.definition.workitemtracking

import kotlin.Int
import kotlin.String

interface AccountWorkWorkItemModel {
  val assignedTo: String

  val changedDate: String

  val id: Int

  val state: String

  val teamProject: String

  val title: String

  val workItemType: String
}
