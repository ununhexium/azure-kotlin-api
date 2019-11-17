package net.lab0.azure.git.model.definition

import kotlin.String

interface GitImportSucceededEvent {
  val sourceRepositoryName: String

  val targetRepository: GitRepository
}
