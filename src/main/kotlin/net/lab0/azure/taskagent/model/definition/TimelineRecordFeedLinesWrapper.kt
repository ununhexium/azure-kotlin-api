package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface TimelineRecordFeedLinesWrapper {
  val count: Int

  val stepId: String

  val value: List<String>
}
