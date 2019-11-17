package net.lab0.azure.git.model.definition

import kotlin.String
import net.lab0.azure.git.model.definition.enumeration.GitObjectType

interface GitItem : ItemModel {
  /**
   * SHA1 of commit item was fetched at
   */
  val commitId: String

  /**
   * Type of object (Commit, Tree, Blob, Tag, ...)
   */
  val gitObjectType: GitObjectType

  val latestProcessedChange: GitCommitRef

  /**
   * Git object id
   */
  val objectId: String

  /**
   * Git object id
   */
  val originalObjectId: String
}
