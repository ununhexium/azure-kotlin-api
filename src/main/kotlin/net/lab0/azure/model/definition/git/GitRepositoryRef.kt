package net.lab0.azure.model.definition.git

import kotlin.Boolean
import kotlin.String

interface GitRepositoryRef {
  val collection: TeamProjectCollectionReference

  val id: String

  /**
   * True if the repository was created as a fork
   */
  val isFork: Boolean

  val name: String

  val project: TeamProjectReference

  val remoteUrl: String

  val sshUrl: String

  val url: String
}
