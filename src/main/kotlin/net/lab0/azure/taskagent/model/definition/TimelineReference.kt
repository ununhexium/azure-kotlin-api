package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String

interface TimelineReference {
  val changeId: Int

  val id: String

  val location: String
}
