package net.lab0.azure.model.definition.git

import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.GitObjectType

/**
 * Git object identifier and type information.
 */
interface GitObject {
  /**
   * Object Id (Sha1Id).
   */
  val objectId: String

  /**
   * Type of object (Commit, Tree, Blob, Tag)
   */
  val objectType: GitObjectType
}
