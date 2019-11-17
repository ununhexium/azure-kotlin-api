package net.lab0.azure.git.model.definition

import kotlin.Int
import kotlin.String

interface GitChange : Change {
  /**
   * ID of the change within the group of changes.
   */
  val changeId: Int

  val newContentTemplate: GitTemplate

  /**
   * Original path of item if different from current path.
   */
  val originalPath: String
}
