package net.lab0.azure.git.model.definition

import kotlin.String
import net.lab0.azure.git.model.definition.enumeration.GitObjectType

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
