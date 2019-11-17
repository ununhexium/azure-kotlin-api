package net.lab0.azure.git.model.definition

import kotlin.collections.List

interface GitPush : GitPushRef {
  val commits: List<GitCommitRef>

  val refUpdates: List<GitRefUpdate>

  val repository: GitRepository
}
