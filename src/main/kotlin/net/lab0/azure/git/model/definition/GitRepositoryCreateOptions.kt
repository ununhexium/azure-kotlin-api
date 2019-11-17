package net.lab0.azure.git.model.definition

import kotlin.String

interface GitRepositoryCreateOptions {
  val name: String

  val parentRepository: GitRepositoryRef

  val project: TeamProjectReference
}
