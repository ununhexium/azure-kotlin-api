package net.lab0.azure.model.definition.release

import kotlin.String
import kotlin.collections.List

interface ContainerImageTrigger : ReleaseTriggerBase {
  val alias: String

  val tagFilters: List<TagFilter>
}
