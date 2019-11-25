package net.lab0.azure.model.definition.git

import kotlin.collections.List

interface GitPush : GitPushRef {
  val commits: List<GitCommitRef>

  val refUpdates: List<GitRefUpdate>

  val repository: GitRepository
}
