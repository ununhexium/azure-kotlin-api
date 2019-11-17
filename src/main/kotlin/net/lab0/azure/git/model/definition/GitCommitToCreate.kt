package net.lab0.azure.git.model.definition

import kotlin.String
import kotlin.collections.List

interface GitCommitToCreate {
  val baseRef: GitRef

  val comment: String

  val pathActions: List<GitPathAction>
}
