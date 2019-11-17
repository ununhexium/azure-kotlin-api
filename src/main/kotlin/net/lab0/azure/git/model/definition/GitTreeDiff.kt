package net.lab0.azure.git.model.definition

import kotlin.String
import kotlin.collections.List

interface GitTreeDiff {
  /**
   * ObjectId of the base tree of this diff.
   */
  val baseTreeId: String

  /**
   * List of tree entries that differ between the base and target tree.  Renames and object type
   * changes are returned as a delete for the old object and add for the new object.  If a continuation
   * token is returned in the response header, some tree entries are yet to be processed and may yeild
   * more diff entries. If the continuation token is not returned all the diff entries have been
   * included in this response.
   */
  val diffEntries: List<GitTreeDiffEntry>

  /**
   * ObjectId of the target tree of this diff.
   */
  val targetTreeId: String

  /**
   * REST Url to this resource.
   */
  val url: String
}
