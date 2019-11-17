package net.lab0.azure.release.model.definition

import kotlin.String
import kotlin.collections.List

interface SourceRepoTrigger : ReleaseTriggerBase {
  val alias: String

  val branchFilters: List<String>
}
