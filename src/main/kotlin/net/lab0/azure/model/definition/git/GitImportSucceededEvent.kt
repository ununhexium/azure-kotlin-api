package net.lab0.azure.model.definition.git

import kotlin.String

interface GitImportSucceededEvent {
  val sourceRepositoryName: String

  val targetRepository: GitRepository
}
