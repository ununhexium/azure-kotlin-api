package net.lab0.azure.git.model.definition

import kotlin.String

interface GitLastChangeItem {
  /**
   * Gets or sets the commit Id this item was modified most recently for the provided version.
   */
  val commitId: String

  /**
   * Gets or sets the path of the item.
   */
  val path: String
}
