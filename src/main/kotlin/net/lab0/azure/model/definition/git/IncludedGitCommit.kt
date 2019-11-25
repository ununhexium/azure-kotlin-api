package net.lab0.azure.model.definition.git

import kotlin.String
import kotlin.collections.List

interface IncludedGitCommit {
  val commitId: String

  val commitTime: String

  val parentCommitIds: List<String>

  val repositoryId: String
}
