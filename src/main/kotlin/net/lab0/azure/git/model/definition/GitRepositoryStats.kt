package net.lab0.azure.git.model.definition

import kotlin.Int
import kotlin.String

interface GitRepositoryStats {
  val activePullRequestsCount: Int

  val branchesCount: Int

  val commitsCount: Int

  val repositoryId: String
}
