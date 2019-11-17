package net.lab0.azure.workitemtracking.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface WorkItemBehavior {
  val abstract: Boolean

  val color: String

  val description: String

  val fields: List<WorkItemBehaviorField>

  val id: String

  val inherits: WorkItemBehaviorReference

  val name: String

  val overriden: Boolean

  val rank: Int

  val url: String
}
