package net.lab0.azure.git.model.definition

import kotlin.String
import kotlin.collections.List

interface IncludedGitCommit {
  val commitId: String

  val commitTime: String

  val parentCommitIds: List<String>

  val repositoryId: String
}
