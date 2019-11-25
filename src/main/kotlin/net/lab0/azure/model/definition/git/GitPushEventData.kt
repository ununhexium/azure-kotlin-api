package net.lab0.azure.model.definition.git

import kotlin.String
import kotlin.collections.List

interface GitPushEventData {
  val afterId: String

  val beforeId: String

  val branch: String

  val commits: List<GitCommit>

  val repository: GitRepository
}
