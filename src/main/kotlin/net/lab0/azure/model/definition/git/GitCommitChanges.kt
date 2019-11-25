package net.lab0.azure.model.definition.git

import kotlin.collections.List

interface GitCommitChanges {
  val changeCounts: ChangeCountDictionary

  val changes: List<GitChange>
}
