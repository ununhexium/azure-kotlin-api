package net.lab0.azure.git.model.definition

import kotlin.collections.List

interface GitCommitChanges {
  val changeCounts: ChangeCountDictionary

  val changes: List<GitChange>
}
