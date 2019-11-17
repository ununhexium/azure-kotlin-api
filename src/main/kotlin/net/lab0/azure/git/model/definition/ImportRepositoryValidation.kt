package net.lab0.azure.git.model.definition

import kotlin.String

interface ImportRepositoryValidation {
  val gitSource: GitImportGitSource

  val password: String

  val tfvcSource: GitImportTfvcSource

  val username: String
}
