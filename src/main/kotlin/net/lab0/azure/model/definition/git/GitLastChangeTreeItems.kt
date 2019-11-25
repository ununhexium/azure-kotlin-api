package net.lab0.azure.model.definition.git

import kotlin.String
import kotlin.collections.List

interface GitLastChangeTreeItems {
  /**
   * The list of commits referenced by Items, if they were requested.
   */
  val commits: List<GitCommitRef>

  /**
   * The last change of items.
   */
  val items: List<GitLastChangeItem>

  /**
   * The last explored time, in case the result is not comprehensive. Null otherwise.
   */
  val lastExploredTime: String
}
