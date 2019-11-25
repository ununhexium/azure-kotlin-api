package net.lab0.azure.model.definition.git

import kotlin.String

interface GitImportFailedEvent {
  val sourceRepositoryName: String

  val targetRepository: GitRepository
}
