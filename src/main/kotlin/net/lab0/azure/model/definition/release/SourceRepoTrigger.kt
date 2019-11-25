package net.lab0.azure.model.definition.release

import kotlin.String
import kotlin.collections.List

interface SourceRepoTrigger : ReleaseTriggerBase {
  val alias: String

  val branchFilters: List<String>
}
