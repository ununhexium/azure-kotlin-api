package net.lab0.azure.model.definition.git

import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.GitObjectType
import net.lab0.azure.model.definition.enumeration.git.VersionControlChangeType

interface GitTreeDiffEntry {
  /**
   * SHA1 hash of the object in the base tree, if it exists. Will be null in case of adds.
   */
  val baseObjectId: String

  /**
   * Type of change that affected this entry.
   */
  val changeType: VersionControlChangeType

  /**
   * Object type of the tree entry. Blob, Tree or Commit("submodule")
   */
  val objectType: GitObjectType

  /**
   * Relative path in base and target trees.
   */
  val path: String

  /**
   * SHA1 hash of the object in the target tree, if it exists. Will be null in case of deletes.
   */
  val targetObjectId: String
}
