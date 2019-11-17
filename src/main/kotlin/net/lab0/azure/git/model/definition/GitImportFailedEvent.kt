package net.lab0.azure.git.model.definition

import kotlin.String

interface GitImportFailedEvent {
  val sourceRepositoryName: String

  val targetRepository: GitRepository
}
