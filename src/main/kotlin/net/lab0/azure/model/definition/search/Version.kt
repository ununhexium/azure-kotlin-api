package net.lab0.azure.model.definition.search

import kotlin.String

/**
 * Describes the details pertaining to a version of the result file.
 */
interface Version {
  /**
   * Name of the branch.
   */
  val branchName: String

  /**
   * ChangeId in the given branch associated with this match.
   */
  val changeId: String
}
