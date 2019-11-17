package net.lab0.azure.git.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface GitTreeRef {
  val _links: ReferenceLinks

  /**
   * SHA1 hash of git object
   */
  val objectId: String

  /**
   * Sum of sizes of all children
   */
  val size: Int

  /**
   * Blobs and trees under this tree
   */
  val treeEntries: List<GitTreeEntryRef>

  /**
   * Url to tree
   */
  val url: String
}
