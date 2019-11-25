package net.lab0.azure.model.definition.git

import kotlin.Int
import kotlin.String

interface GitRepositoryStats {
  val activePullRequestsCount: Int

  val branchesCount: Int

  val commitsCount: Int

  val repositoryId: String
}
