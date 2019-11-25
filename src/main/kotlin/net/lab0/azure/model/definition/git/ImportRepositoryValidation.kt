package net.lab0.azure.model.definition.git

import kotlin.String

interface ImportRepositoryValidation {
  val gitSource: GitImportGitSource

  val password: String

  val tfvcSource: GitImportTfvcSource

  val username: String
}
