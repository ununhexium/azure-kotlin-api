package net.lab0.azure.model.definition.git

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface GitCommitDiffs {
  val aheadCount: Int

  val allChangesIncluded: Boolean

  val baseCommit: String

  val behindCount: Int

  val changeCounts: JsonObject

  val changes: List<GitChange>

  val commonCommit: String

  val targetCommit: String
}
