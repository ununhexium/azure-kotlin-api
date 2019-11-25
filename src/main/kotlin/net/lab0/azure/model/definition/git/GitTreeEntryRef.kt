package net.lab0.azure.model.definition.git

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.GitObjectType

interface GitTreeEntryRef {
  /**
   * Blob or tree
   */
  val gitObjectType: GitObjectType

  /**
   * Mode represented as octal string
   */
  val mode: String

  /**
   * SHA1 hash of git object
   */
  val objectId: String

  /**
   * Path relative to parent tree object
   */
  val relativePath: String

  /**
   * Size of content
   */
  val size: Int

  /**
   * url to retrieve tree or blob
   */
  val url: String
}
