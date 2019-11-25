package net.lab0.azure.model.definition.taskagent

import kotlin.String
import kotlin.collections.List

interface Timeline : TimelineReference {
  val lastChangedBy: String

  val lastChangedOn: String

  val records: List<TimelineRecord>
}
