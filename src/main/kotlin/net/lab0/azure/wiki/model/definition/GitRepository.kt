package net.lab0.azure.wiki.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface GitRepository {
  val _links: String

  val defaultBranch: String

  val id: String

  /**
   * True if the repository was created as a fork
   */
  val isFork: Boolean

  val name: String

  val parentRepository: GitRepositoryRef

  val project: String

  val remoteUrl: String

  /**
   * Compressed size (bytes) of the repository.
   */
  val size: Int

  val sshUrl: String

  val url: String

  val validRemoteUrls: List<String>
}
