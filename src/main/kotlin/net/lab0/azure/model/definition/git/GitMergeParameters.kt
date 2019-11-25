package net.lab0.azure.model.definition.git

import kotlin.String
import kotlin.collections.List

/**
 * Parameters required for performing git merge.
 */
interface GitMergeParameters {
  /**
   * Comment or message of the commit.
   */
  val comment: String

  /**
   * An enumeration of the parent commit IDs for the merge  commit.
   */
  val parents: List<String>
}
