package net.lab0.azure.model.definition.git

import kotlin.String

interface GitRepositoryCreateOptions {
  val name: String

  val parentRepository: GitRepositoryRef

  val project: TeamProjectReference
}
