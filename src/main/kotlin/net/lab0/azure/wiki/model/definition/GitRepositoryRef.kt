package net.lab0.azure.wiki.model.definition

import kotlin.Boolean
import kotlin.String

interface GitRepositoryRef {
  /**
   * Team Project Collection where this Fork resides
   */
  val collection: String

  val id: String

  /**
   * True if the repository was created as a fork
   */
  val isFork: Boolean

  val name: String

  val project: String

  val remoteUrl: String

  val sshUrl: String

  val url: String
}
